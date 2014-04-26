package strat.mining.stratum.proxy.json;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MiningSubmitResponse extends JsonRpcResponse {

	@JsonIgnore
	private Boolean isAccepted;

	public MiningSubmitResponse() {
		super();
	}

	public MiningSubmitResponse(JsonRpcResponse response) {
		super(response);
	}

	public Boolean getIsAccepted() {
		return isAccepted;
	}

	public void setIsAccepted(Boolean isAccepted) {
		this.isAccepted = isAccepted;
	}

	@Override
	public Object getResult() {
		return isAccepted;
	}

	@Override
	public void setResult(Object result) {
		this.isAccepted = (Boolean) result;
	}

}