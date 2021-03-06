
package myProject_LSP.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

/*수정*/
@FeignClient(name="point", url="${api.url.point}")
public interface PointService {

    @RequestMapping(method= RequestMethod.POST, path="/points")
    public void pointSend(@RequestBody Point point);

}