package com.geonyeong.dao;
 
import java.util.List;
 
import com.geonyeong.vo.WineVO;
 
public interface WineDAO {
    
    public List<WineVO> selectwine() throws Exception;
}
 
