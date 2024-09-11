package com.sz.admin.system.service;

import com.mybatisflex.core.service.IService;
import com.sz.admin.system.pojo.po.SysTempFile;
import com.sz.core.common.entity.SelectIdsDTO;
import com.sz.core.common.entity.PageResult;
import java.util.List;
import com.sz.admin.system.pojo.dto.systempfile.SysTempFileCreateDTO;
import com.sz.admin.system.pojo.dto.systempfile.SysTempFileUpdateDTO;
import com.sz.admin.system.pojo.dto.systempfile.SysTempFileListDTO;
import com.sz.admin.system.pojo.vo.systempflie.SysTempFileVO;
import org.springframework.web.multipart.MultipartFile;

/**
 * <p>
 * 模版文件表 Service
 * </p>
 *
 * @author sz-admin
 * @since 2024-09-05
 */
public interface SysTempFileService extends IService<SysTempFile> {

    void create(SysTempFileCreateDTO dto);

    void update(SysTempFileUpdateDTO dto);

    PageResult<SysTempFileVO> page(SysTempFileListDTO dto);

    List<SysTempFileVO> list(SysTempFileListDTO dto);

    void remove(SelectIdsDTO dto);

    SysTempFileVO detail(Object id);

}
