package com.tigerbrokers.stock.openapi.client.https.response.future;

import com.alibaba.fastjson.annotation.JSONField;
import com.tigerbrokers.stock.openapi.client.https.response.TigerResponse;
import com.tigerbrokers.stock.openapi.client.struct.Contract;
import java.util.List;
import lombok.Data;

/**
 * Description:
 * Created by lijiawen on 2018/12/25.
 */
@Data
public class FutureBatchContractResponse extends TigerResponse {

  @JSONField(name = "data")
  private List<Contract> futureContractItems;

}
