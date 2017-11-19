package cn.itcast.pro.domian;

import cn.itcast.pro.dao.BaseDao;
import cn.itcast.pro.domain.TWinxExbEntList;
import cn.itcast.pro.domain.TWinxExbHead;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by JohnBi on 2017-11-18. 20:34
 *
 * @author Lemon
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class DomainTest {

    @Autowired
    private BaseDao baseDao;


    @Test
    public void testHead() {

        Set<TWinxExbEntList> tWinxExbEntLists = new HashSet<>();


        for (int i = 1; i < 10; i++) {
            TWinxExbEntList tWinxExbEntList = new TWinxExbEntList();
            tWinxExbEntList.setAuthor(i + "作者");

            tWinxExbEntLists.add(tWinxExbEntList);

        }

        TWinxExbHead tWinxExbHead = new TWinxExbHead();
        tWinxExbHead.setTWinxExbEntLists(tWinxExbEntLists);

        baseDao.saveOrUpdate(tWinxExbHead);

    }
}
