package com.aidancloud.core.base.protocol.param;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * 基于MybatisPlus包装分页
 * @author hutao
 * @date 2019-11-06 18:08
 */
public class QueryPage<T> extends Page<T> {

    /**
     * 默认当前页为第一页
     */
    private static final Long DEFAULT_CURRENT_PAGE =1L;
    /**
     * 默认每页数量为10
     */
    private static final Long DEFAULT_PAGE_SIZE =10L;

    public QueryPage(){
        super(DEFAULT_CURRENT_PAGE, DEFAULT_PAGE_SIZE);
    }

    public QueryPage(QueryParam queryParam) {
        super(queryParam.getCurrentPage(), queryParam.getPageSize());
    }

    public Long getCurrentPage(){
        return this.getCurrent();
    }

    public void setCurrentPage(Long currentPage){
        if (currentPage != null){
            this.setCurrent(currentPage);
        }
    }

    public Long getPageSize(){
        return this.getSize();
    }

    public void setPageSize(Long pageSise){
        if (pageSise != null) {
            this.setSize(pageSise);
        }
    }
}
