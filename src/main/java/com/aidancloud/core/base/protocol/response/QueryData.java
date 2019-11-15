package com.aidancloud.core.base.protocol.response;

import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author hutao
 * @date 2019-11-06 18:18
 */
@ApiModel(value = "QueryData", description = "分页返回数据")
@Data
public class QueryData<T> {

    private List<T> list;

    @ApiModelProperty(value = "数据总计")
    private long total;

    @ApiModelProperty(value = "当前页码")
    private long currentPage;

    @ApiModelProperty(value = "每页数量")
    private long pageSize;

    public QueryData() {
    }

    public QueryData(IPage<T> page) {
        this.setList(page.getRecords());
        this.setTotal(page.getTotal());
        this.setCurrentPage(page.getCurrent());
        this.setPageSize(page.getSize());
    }

    public <E> QueryData(IPage<E> page, Function<E, T> mapper){
        this.setCurrentPage(page.getCurrent());
        this.setPageSize(page.getSize());
        this.setTotal(page.getTotal());

        List<E> records = page.getRecords();

        if (records == null || records.isEmpty()){
            this.setList(Collections.emptyList());
        } else {
            this.setList(page.getRecords().stream().map(mapper).collect(Collectors.toList()));
        }
    }

    public QueryData(List<T> list, long total, long currentPage, long pageSize) {
        this.list = list;
        this.total = total;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
    }

    public <E> QueryData(IPage<E> page, List<T> list) {
        this.list = list;
        this.setCurrentPage(page.getCurrent());
        this.setPageSize(page.getSize());
        this.setTotal(page.getTotal());
    }
}
