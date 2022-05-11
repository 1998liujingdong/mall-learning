package com.cqupt.service;

import com.cqupt.mbg.model.PmsBrand;

import java.util.List;

/**
 * @author jingdong
 * @description:
 * @menu
 * @date 2022/5/11 18:47
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
