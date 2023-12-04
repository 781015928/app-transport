package com.crazypug.download.message;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateAndSubscribeMessage {

    private String topic;

    private List<File> files;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class File {
        private String fileId;
        private String saveName;
    }


}
