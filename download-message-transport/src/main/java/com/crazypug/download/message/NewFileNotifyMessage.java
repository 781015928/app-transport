package com.crazypug.download.message;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NewFileNotifyMessage {

    public static final String TOPIC= "topic-newfile-notify";


    private List<File> files;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class File {
        private String fileId;
        private String fileName;
        private Long length;
        private String parentName;

    }


}
