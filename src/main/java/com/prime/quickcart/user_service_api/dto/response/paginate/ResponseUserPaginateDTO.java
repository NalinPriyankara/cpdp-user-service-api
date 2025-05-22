package com.prime.quickcart.user_service_api.dto.response.paginate;

import com.prime.quickcart.user_service_api.dto.response.ResponseUserDTO;

import java.util.List;

public class ResponseUserPaginateDTO {
    private long count;
    private List<ResponseUserDTO> items;
}
