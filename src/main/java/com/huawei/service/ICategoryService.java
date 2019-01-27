package com.huawei.service;
import java.util.List;
import com.huawei.common.ServerResponse;
import com.huawei.pojo.Category;
/**
 * 
 * Description:
 * @author cuibeijie
 * @date 2019年1月27日
 */
public interface ICategoryService {
    ServerResponse addCategory(String categoryName, Integer parentId);
    ServerResponse updateCategoryName(Integer categoryId,String categoryName);
    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);
    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);

}
