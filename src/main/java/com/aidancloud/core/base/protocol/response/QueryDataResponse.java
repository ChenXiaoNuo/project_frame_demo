package com.aidancloud.core.base.protocol.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author hutao
 * @date 2019-11-06 18:27
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class QueryDataResponse<T> extends CommonResponse<QueryData<T>> {

    public QueryDataResponse(){

    }

    public QueryDataResponse(QueryData<T> data){
        super(data);
    }


}
