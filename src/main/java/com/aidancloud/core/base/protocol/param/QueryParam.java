package com.aidancloud.core.base.protocol.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author hutao
 * @date 2019-11-06 18:12
 */
@ApiModel(value = "QueryParam", description = "获取列表的分页请求数据")
public class QueryParam {
    /**
     * 默认页码，第一页
     */
    private static final int DEFAULT_CURRENT_PAGE =1;
    /**
     * 默认分页10条记录
     */
    private static final int DEFAULT_PAGE_SIZE =10;

    /**
     * 页码
     */

    @ApiModelProperty(value = "当前页码,从1开始，默认1", example = "1")
    protected Integer currentPage = DEFAULT_CURRENT_PAGE;
    /**
     * 分页大小
     */
    @ApiModelProperty(value = "分页大小,默认10", example = "10")
    protected Integer pageSize = DEFAULT_PAGE_SIZE;

    public Integer getCurrentPage() {
        if (this.currentPage == null){
            return DEFAULT_CURRENT_PAGE;
        }
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        if (this.pageSize == null) {
            return DEFAULT_PAGE_SIZE;
        }
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

}
