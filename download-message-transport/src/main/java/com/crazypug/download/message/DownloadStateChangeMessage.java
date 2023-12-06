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
public class DownloadStateChangeMessage {




    private String yunParentName;

    private List<File> files;

    public static final int DOWNLOAD_ED = 0,
            DOWNLOAD_ING = 1,
            DOWNLOAD_SUCCESS = 2;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class File {
        private String taskId;
        private String fileId;
        private String fileName;
        private String savePath;
        private Integer downloadStatus;
    }

}
