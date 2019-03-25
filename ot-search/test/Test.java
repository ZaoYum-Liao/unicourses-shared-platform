import com.ourTeam.search.pojo.SearchResult;
import com.ourTeam.search.service.SearchService;
import com.ourTeam.search.service.impl.SearchServiceImpl;

public class Test {

    @org.junit.Test
    public void searchCourse1() throws Exception {
        SearchService searchService = new SearchServiceImpl();
        SearchResult result = searchService.search("统计力学",1,10);
        System.out.println(result);
    }
}
