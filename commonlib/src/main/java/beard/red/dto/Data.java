
package beard.red.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Data implements Serializable
{

    private Securities securities;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7882810311214983748L;

    public Securities getSecurities() {
        return securities;
    }

    public void setSecurities(Securities securities) {
        this.securities = securities;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
