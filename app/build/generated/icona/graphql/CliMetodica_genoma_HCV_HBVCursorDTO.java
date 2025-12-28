package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Metodica_genoma_HCV_HBV.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliMetodica_genoma_HCV_HBVCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _createdby;
    private String _createdon;
    private String _id;
    private String _lastmodifiedby;
    private String _lastmodifiedon;
    private String _ownedby;
    private String _ownedon;
    private Integer codice;
    private String codice_DAD;
    private String codice_inchehp;
    private Boolean hbv;
    private Boolean hcv;
    private Boolean hdv;
    private String nome;

    public CliMetodica_genoma_HCV_HBVCursorDTO() {
    }


    public String get_createdby() {
        return _createdby;
    }
    public void set_createdby(String _createdby) {
        this._createdby = _createdby;
    }

    public String get_createdon() {
        return _createdon;
    }
    public void set_createdon(String _createdon) {
        this._createdon = _createdon;
    }

    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_lastmodifiedby() {
        return _lastmodifiedby;
    }
    public void set_lastmodifiedby(String _lastmodifiedby) {
        this._lastmodifiedby = _lastmodifiedby;
    }

    public String get_lastmodifiedon() {
        return _lastmodifiedon;
    }
    public void set_lastmodifiedon(String _lastmodifiedon) {
        this._lastmodifiedon = _lastmodifiedon;
    }

    public String get_ownedby() {
        return _ownedby;
    }
    public void set_ownedby(String _ownedby) {
        this._ownedby = _ownedby;
    }

    public String get_ownedon() {
        return _ownedon;
    }
    public void set_ownedon(String _ownedon) {
        this._ownedon = _ownedon;
    }

    public Integer getCodice() {
        return codice;
    }
    public void setCodice(Integer codice) {
        this.codice = codice;
    }

    public String getCodice_DAD() {
        return codice_DAD;
    }
    public void setCodice_DAD(String codice_DAD) {
        this.codice_DAD = codice_DAD;
    }

    public String getCodice_inchehp() {
        return codice_inchehp;
    }
    public void setCodice_inchehp(String codice_inchehp) {
        this.codice_inchehp = codice_inchehp;
    }

    public Boolean getHbv() {
        return hbv;
    }
    public void setHbv(Boolean hbv) {
        this.hbv = hbv;
    }

    public Boolean getHcv() {
        return hcv;
    }
    public void setHcv(Boolean hcv) {
        this.hcv = hcv;
    }

    public Boolean getHdv() {
        return hdv;
    }
    public void setHdv(Boolean hdv) {
        this.hdv = hdv;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_createdby != null) {
            joiner.add("_createdby: " + GraphQLRequestSerializer.getEntry(_createdby));
        }
        if (_createdon != null) {
            joiner.add("_createdon: " + GraphQLRequestSerializer.getEntry(_createdon));
        }
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (_lastmodifiedby != null) {
            joiner.add("_lastmodifiedby: " + GraphQLRequestSerializer.getEntry(_lastmodifiedby));
        }
        if (_lastmodifiedon != null) {
            joiner.add("_lastmodifiedon: " + GraphQLRequestSerializer.getEntry(_lastmodifiedon));
        }
        if (_ownedby != null) {
            joiner.add("_ownedby: " + GraphQLRequestSerializer.getEntry(_ownedby));
        }
        if (_ownedon != null) {
            joiner.add("_ownedon: " + GraphQLRequestSerializer.getEntry(_ownedon));
        }
        if (codice != null) {
            joiner.add("codice: " + GraphQLRequestSerializer.getEntry(codice));
        }
        if (codice_DAD != null) {
            joiner.add("codice_DAD: " + GraphQLRequestSerializer.getEntry(codice_DAD));
        }
        if (codice_inchehp != null) {
            joiner.add("codice_inchehp: " + GraphQLRequestSerializer.getEntry(codice_inchehp));
        }
        if (hbv != null) {
            joiner.add("hbv: " + GraphQLRequestSerializer.getEntry(hbv));
        }
        if (hcv != null) {
            joiner.add("hcv: " + GraphQLRequestSerializer.getEntry(hcv));
        }
        if (hdv != null) {
            joiner.add("hdv: " + GraphQLRequestSerializer.getEntry(hdv));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        return joiner.toString();
    }

    public static CliMetodica_genoma_HCV_HBVCursorDTO.Builder builder() {
        return new CliMetodica_genoma_HCV_HBVCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _createdby;
        private String _createdon;
        private String _id;
        private String _lastmodifiedby;
        private String _lastmodifiedon;
        private String _ownedby;
        private String _ownedon;
        private Integer codice;
        private String codice_DAD;
        private String codice_inchehp;
        private Boolean hbv;
        private Boolean hcv;
        private Boolean hdv;
        private String nome;

        public Builder() {
        }

        public Builder set_createdby(String _createdby) {
            this._createdby = _createdby;
            return this;
        }

        public Builder set_createdon(String _createdon) {
            this._createdon = _createdon;
            return this;
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder set_lastmodifiedby(String _lastmodifiedby) {
            this._lastmodifiedby = _lastmodifiedby;
            return this;
        }

        public Builder set_lastmodifiedon(String _lastmodifiedon) {
            this._lastmodifiedon = _lastmodifiedon;
            return this;
        }

        public Builder set_ownedby(String _ownedby) {
            this._ownedby = _ownedby;
            return this;
        }

        public Builder set_ownedon(String _ownedon) {
            this._ownedon = _ownedon;
            return this;
        }

        public Builder setCodice(Integer codice) {
            this.codice = codice;
            return this;
        }

        public Builder setCodice_DAD(String codice_DAD) {
            this.codice_DAD = codice_DAD;
            return this;
        }

        public Builder setCodice_inchehp(String codice_inchehp) {
            this.codice_inchehp = codice_inchehp;
            return this;
        }

        public Builder setHbv(Boolean hbv) {
            this.hbv = hbv;
            return this;
        }

        public Builder setHcv(Boolean hcv) {
            this.hcv = hcv;
            return this;
        }

        public Builder setHdv(Boolean hdv) {
            this.hdv = hdv;
            return this;
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }


        public CliMetodica_genoma_HCV_HBVCursorDTO build() {
            CliMetodica_genoma_HCV_HBVCursorDTO result = new CliMetodica_genoma_HCV_HBVCursorDTO();
            result.set_createdby(this._createdby);
            result.set_createdon(this._createdon);
            result.set_id(this._id);
            result.set_lastmodifiedby(this._lastmodifiedby);
            result.set_lastmodifiedon(this._lastmodifiedon);
            result.set_ownedby(this._ownedby);
            result.set_ownedon(this._ownedon);
            result.setCodice(this.codice);
            result.setCodice_DAD(this.codice_DAD);
            result.setCodice_inchehp(this.codice_inchehp);
            result.setHbv(this.hbv);
            result.setHcv(this.hcv);
            result.setHdv(this.hdv);
            result.setNome(this.nome);
            return result;
        }

    }
}
