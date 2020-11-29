package com.shareeverything.dto;

import com.shareeverything.constant.ResponseStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponseDto {

    ResponseStatus status;
    String message;

}
