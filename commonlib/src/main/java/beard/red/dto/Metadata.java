
package beard.red.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Metadata implements Serializable
{

    private Id id;
    private Secid secid;
    private Shortname shortname;
    private Regnumber regnumber;
    private Name name;
    private Isin isin;
    private IsTraded isTraded;
    private EmitentId emitentId;
    private EmitentTitle emitentTitle;
    private EmitentInn emitentInn;
    private EmitentOkpo emitentOkpo;
    private Gosreg gosreg;
    private Type type;
    private Group group;
    private PrimaryBoardid primaryBoardid;
    private MarketpriceBoardid marketpriceBoardid;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5364010427621110698L;

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public Secid getSecid() {
        return secid;
    }

    public void setSecid(Secid secid) {
        this.secid = secid;
    }

    public Shortname getShortname() {
        return shortname;
    }

    public void setShortname(Shortname shortname) {
        this.shortname = shortname;
    }

    public Regnumber getRegnumber() {
        return regnumber;
    }

    public void setRegnumber(Regnumber regnumber) {
        this.regnumber = regnumber;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Isin getIsin() {
        return isin;
    }

    public void setIsin(Isin isin) {
        this.isin = isin;
    }

    public IsTraded getIsTraded() {
        return isTraded;
    }

    public void setIsTraded(IsTraded isTraded) {
        this.isTraded = isTraded;
    }

    public EmitentId getEmitentId() {
        return emitentId;
    }

    public void setEmitentId(EmitentId emitentId) {
        this.emitentId = emitentId;
    }

    public EmitentTitle getEmitentTitle() {
        return emitentTitle;
    }

    public void setEmitentTitle(EmitentTitle emitentTitle) {
        this.emitentTitle = emitentTitle;
    }

    public EmitentInn getEmitentInn() {
        return emitentInn;
    }

    public void setEmitentInn(EmitentInn emitentInn) {
        this.emitentInn = emitentInn;
    }

    public EmitentOkpo getEmitentOkpo() {
        return emitentOkpo;
    }

    public void setEmitentOkpo(EmitentOkpo emitentOkpo) {
        this.emitentOkpo = emitentOkpo;
    }

    public Gosreg getGosreg() {
        return gosreg;
    }

    public void setGosreg(Gosreg gosreg) {
        this.gosreg = gosreg;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public PrimaryBoardid getPrimaryBoardid() {
        return primaryBoardid;
    }

    public void setPrimaryBoardid(PrimaryBoardid primaryBoardid) {
        this.primaryBoardid = primaryBoardid;
    }

    public MarketpriceBoardid getMarketpriceBoardid() {
        return marketpriceBoardid;
    }

    public void setMarketpriceBoardid(MarketpriceBoardid marketpriceBoardid) {
        this.marketpriceBoardid = marketpriceBoardid;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
