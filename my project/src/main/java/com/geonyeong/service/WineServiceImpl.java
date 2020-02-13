package com.geonyeong.service;
 
import java.util.List;
 
import javax.inject.Inject;
 
import org.springframework.stereotype.Service;
 
import com.geonyeong.dao.WineDAO;
import com.geonyeong.vo.WineVO;
 
@Service
public class WineServiceImpl implements WineService {
 
    @Inject
    private WineDAO dao;
    
    @Override
    public List<WineVO> selectwine() throws Exception {
 
        return dao.selectwine();
    }
 
}
