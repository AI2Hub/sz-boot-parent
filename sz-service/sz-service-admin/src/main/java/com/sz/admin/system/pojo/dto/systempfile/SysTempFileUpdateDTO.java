package com.sz.admin.system.pojo.dto.systempfile;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * <p>
 * SysTempFile修改DTO
 * </p>
 *
 * @author sz-admin
 * @since 2024-09-05
 */
@Data
@Schema(description = "SysTempFile修改DTO")
public class SysTempFileUpdateDTO {

    @Schema(description =  "")
    private Long id;

    @Schema(description =  "模版名称")
    private String name;

    @Schema(description =  "标识")
    private String permissions;

    @Schema(description =  "扩展类型")
    private String ext;

    @Schema(description =  "文件路径")
    private String path;

    @Schema(description =  "文件地址")
    private String url;

}