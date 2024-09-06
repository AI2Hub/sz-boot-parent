package com.sz.admin.system.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.web.bind.annotation.*;
import com.sz.core.common.entity.ApiPageResult;
import com.sz.core.common.entity.ApiResult;
import com.sz.core.common.constant.GlobalConstant;
import com.sz.core.common.entity.PageResult;
import com.sz.core.common.entity.SelectIdsDTO;
import com.sz.admin.system.service.SysTempFileService;
import com.sz.admin.system.pojo.dto.systempfile.SysTempFileCreateDTO;
import com.sz.admin.system.pojo.dto.systempfile.SysTempFileUpdateDTO;
import com.sz.admin.system.pojo.dto.systempfile.SysTempFileListDTO;
import com.sz.admin.system.pojo.vo.systempflie.SysTempFileVO;

/**
 * <p>
 * 模版文件表 Controller
 * </p>
 *
 * @author sz-admin
 * @since 2024-09-05
 */
@Tag(name =  "模版文件表")
@RestController
@RequestMapping("sys-temp-file")
@RequiredArgsConstructor
public class SysTempFileController  {

    private final SysTempFileService sysTempFileService;

    @Operation(summary = "新增")
    @SaCheckPermission(value = "sys.temp.file.create", orRole = GlobalConstant.SUPER_ROLE)
    @PostMapping
    public ApiResult create(@RequestBody SysTempFileCreateDTO dto) {
        sysTempFileService.create(dto);
        return ApiResult.success();
    }

    @Operation(summary = "修改")
    @SaCheckPermission(value = "sys.temp.file.update", orRole = GlobalConstant.SUPER_ROLE)
    @PutMapping
    public ApiResult update(@RequestBody SysTempFileUpdateDTO dto) {
        sysTempFileService.update(dto);
        return ApiResult.success();
    }

    @Operation(summary = "删除")
    @SaCheckPermission(value = "sys.temp.file.remove", orRole = GlobalConstant.SUPER_ROLE)
    @DeleteMapping
    public ApiResult remove(@RequestBody SelectIdsDTO dto) {
        sysTempFileService.remove(dto);
        return ApiResult.success();
    }

    @Operation(summary = "列表查询")
    @SaCheckPermission(value = "sys.temp.file.query_table", orRole = GlobalConstant.SUPER_ROLE)
    @GetMapping
    public ApiResult<PageResult<SysTempFileVO>> list(SysTempFileListDTO dto) {
        return ApiPageResult.success(sysTempFileService.page(dto));
    }

    @Operation(summary = "详情")
    @SaCheckPermission(value = "sys.temp.file.query_table", orRole = GlobalConstant.SUPER_ROLE)
    @GetMapping("/{id}")
    public ApiResult<SysTempFileVO> detail(@PathVariable Object id) {
        return ApiResult.success(sysTempFileService.detail(id));
    }


}