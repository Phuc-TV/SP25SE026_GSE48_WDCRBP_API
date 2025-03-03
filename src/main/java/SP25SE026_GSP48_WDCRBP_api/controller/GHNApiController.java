package SP25SE026_GSP48_WDCRBP_api.controller;

import SP25SE026_GSP48_WDCRBP_api.components.CoreApiResponse;
import SP25SE026_GSP48_WDCRBP_api.service.GHNApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/GHNApi")
public class GHNApiController {
    @Autowired
    private GHNApiService ghnApiService;

    @GetMapping("/getProvinces")
    public CoreApiResponse getProvinces()
    {
        return ghnApiService.getProvinces();
    }

    @GetMapping("/getDistricts/{provinceId}")
    public CoreApiResponse getDistricts(@PathVariable int provinceId)
    {
        return ghnApiService.getDistricts(provinceId);
    }

    @PostMapping("/ward")
    public CoreApiResponse getWard(@RequestBody int districtId) {
        return ghnApiService.getWard(districtId);
    }
}
