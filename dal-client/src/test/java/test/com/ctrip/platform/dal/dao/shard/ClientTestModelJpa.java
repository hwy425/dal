package test.com.ctrip.platform.dal.dao.shard;

import java.sql.Timestamp;
import java.sql.Types;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ctrip.platform.dal.dao.annotation.Database;
import com.ctrip.platform.dal.dao.annotation.Type;

// Not used actually
@Database(name="ABC")
public class ClientTestModelJpa {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(value=Types.BIGINT)
    private Integer id;

    @Column(name="quantity")
    @Type(value=Types.INTEGER)
    private Integer quantity;

    @Column(name="tableIndex")
    @Type(value=Types.INTEGER)
    private Integer tableIndex;
    
    @Column(name="type")
    @Type(value=Types.SMALLINT)
    private Short type;
    
    @Column(name="address")
    @Type(value=Types.VARCHAR)
    private String address;
    
    @Column(name="last_changed")
    @Type(value=Types.TIMESTAMP)
    private Timestamp lastChanged;

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Integer getTableIndex() {
        return tableIndex;
    }

    public void setTableIndex(int tableIndex) {
        this.tableIndex = tableIndex;
    }
    
    public Short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timestamp getLastChanged() {
        return lastChanged;
    }

    public void setLastChanged(Timestamp lastChanged) {
        this.lastChanged = lastChanged;
    }
}