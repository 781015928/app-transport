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
public class CreateTransCodeMessage {

    public static final String TOPIC = "topic-create-transcode";


    private Integer deleteInputFile;
    private List<String> inputPath;
    private String outPutPath;
    private String callBackTopic;
    private Map<String, Object> callBackParams;


}
