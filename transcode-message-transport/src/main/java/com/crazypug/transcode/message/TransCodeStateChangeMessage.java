package com.crazypug.transcode.message;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransCodeStateChangeMessage {

    public static final int WAIT = 0, ING = 1, SUCCESS = 2, FAIL = -3;

    private String taskId;

    private Integer status;
    private String outPutPath;

    private Map<String, Object> callBackParams;


}
