package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Mutazione.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliMutazioneCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _createdby;
    private String _createdon;
    private String _id;
    private String _lastmodifiedby;
    private String _lastmodifiedon;
    private String _ownedby;
    private String _ownedon;
    private String aa1;
    private String aa2;
    private String aa3;
    private String aa4;
    private String aa5;
    private Boolean deletion;
    private Boolean insert;
    private Boolean no_farmaco;
    private String object_title;
    private Integer posizione;
    private String regione_genoma;
    private Boolean shift;
    private Integer temp_id;

    public CliMutazioneCursorDTO() {
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

    public String getAa1() {
        return aa1;
    }
    public void setAa1(String aa1) {
        this.aa1 = aa1;
    }

    public String getAa2() {
        return aa2;
    }
    public void setAa2(String aa2) {
        this.aa2 = aa2;
    }

    public String getAa3() {
        return aa3;
    }
    public void setAa3(String aa3) {
        this.aa3 = aa3;
    }

    public String getAa4() {
        return aa4;
    }
    public void setAa4(String aa4) {
        this.aa4 = aa4;
    }

    public String getAa5() {
        return aa5;
    }
    public void setAa5(String aa5) {
        this.aa5 = aa5;
    }

    public Boolean getDeletion() {
        return deletion;
    }
    public void setDeletion(Boolean deletion) {
        this.deletion = deletion;
    }

    public Boolean getInsert() {
        return insert;
    }
    public void setInsert(Boolean insert) {
        this.insert = insert;
    }

    public Boolean getNo_farmaco() {
        return no_farmaco;
    }
    public void setNo_farmaco(Boolean no_farmaco) {
        this.no_farmaco = no_farmaco;
    }

    public String getObject_title() {
        return object_title;
    }
    public void setObject_title(String object_title) {
        this.object_title = object_title;
    }

    public Integer getPosizione() {
        return posizione;
    }
    public void setPosizione(Integer posizione) {
        this.posizione = posizione;
    }

    public String getRegione_genoma() {
        return regione_genoma;
    }
    public void setRegione_genoma(String regione_genoma) {
        this.regione_genoma = regione_genoma;
    }

    public Boolean getShift() {
        return shift;
    }
    public void setShift(Boolean shift) {
        this.shift = shift;
    }

    public Integer getTemp_id() {
        return temp_id;
    }
    public void setTemp_id(Integer temp_id) {
        this.temp_id = temp_id;
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
        if (aa1 != null) {
            joiner.add("aa1: " + GraphQLRequestSerializer.getEntry(aa1));
        }
        if (aa2 != null) {
            joiner.add("aa2: " + GraphQLRequestSerializer.getEntry(aa2));
        }
        if (aa3 != null) {
            joiner.add("aa3: " + GraphQLRequestSerializer.getEntry(aa3));
        }
        if (aa4 != null) {
            joiner.add("aa4: " + GraphQLRequestSerializer.getEntry(aa4));
        }
        if (aa5 != null) {
            joiner.add("aa5: " + GraphQLRequestSerializer.getEntry(aa5));
        }
        if (deletion != null) {
            joiner.add("deletion: " + GraphQLRequestSerializer.getEntry(deletion));
        }
        if (insert != null) {
            joiner.add("insert: " + GraphQLRequestSerializer.getEntry(insert));
        }
        if (no_farmaco != null) {
            joiner.add("no_farmaco: " + GraphQLRequestSerializer.getEntry(no_farmaco));
        }
        if (object_title != null) {
            joiner.add("object_title: " + GraphQLRequestSerializer.getEntry(object_title));
        }
        if (posizione != null) {
            joiner.add("posizione: " + GraphQLRequestSerializer.getEntry(posizione));
        }
        if (regione_genoma != null) {
            joiner.add("regione_genoma: " + GraphQLRequestSerializer.getEntry(regione_genoma));
        }
        if (shift != null) {
            joiner.add("shift: " + GraphQLRequestSerializer.getEntry(shift));
        }
        if (temp_id != null) {
            joiner.add("temp_id: " + GraphQLRequestSerializer.getEntry(temp_id));
        }
        return joiner.toString();
    }

    public static CliMutazioneCursorDTO.Builder builder() {
        return new CliMutazioneCursorDTO.Builder();
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
        private String aa1;
        private String aa2;
        private String aa3;
        private String aa4;
        private String aa5;
        private Boolean deletion;
        private Boolean insert;
        private Boolean no_farmaco;
        private String object_title;
        private Integer posizione;
        private String regione_genoma;
        private Boolean shift;
        private Integer temp_id;

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

        public Builder setAa1(String aa1) {
            this.aa1 = aa1;
            return this;
        }

        public Builder setAa2(String aa2) {
            this.aa2 = aa2;
            return this;
        }

        public Builder setAa3(String aa3) {
            this.aa3 = aa3;
            return this;
        }

        public Builder setAa4(String aa4) {
            this.aa4 = aa4;
            return this;
        }

        public Builder setAa5(String aa5) {
            this.aa5 = aa5;
            return this;
        }

        public Builder setDeletion(Boolean deletion) {
            this.deletion = deletion;
            return this;
        }

        public Builder setInsert(Boolean insert) {
            this.insert = insert;
            return this;
        }

        public Builder setNo_farmaco(Boolean no_farmaco) {
            this.no_farmaco = no_farmaco;
            return this;
        }

        public Builder setObject_title(String object_title) {
            this.object_title = object_title;
            return this;
        }

        public Builder setPosizione(Integer posizione) {
            this.posizione = posizione;
            return this;
        }

        public Builder setRegione_genoma(String regione_genoma) {
            this.regione_genoma = regione_genoma;
            return this;
        }

        public Builder setShift(Boolean shift) {
            this.shift = shift;
            return this;
        }

        public Builder setTemp_id(Integer temp_id) {
            this.temp_id = temp_id;
            return this;
        }


        public CliMutazioneCursorDTO build() {
            CliMutazioneCursorDTO result = new CliMutazioneCursorDTO();
            result.set_createdby(this._createdby);
            result.set_createdon(this._createdon);
            result.set_id(this._id);
            result.set_lastmodifiedby(this._lastmodifiedby);
            result.set_lastmodifiedon(this._lastmodifiedon);
            result.set_ownedby(this._ownedby);
            result.set_ownedon(this._ownedon);
            result.setAa1(this.aa1);
            result.setAa2(this.aa2);
            result.setAa3(this.aa3);
            result.setAa4(this.aa4);
            result.setAa5(this.aa5);
            result.setDeletion(this.deletion);
            result.setInsert(this.insert);
            result.setNo_farmaco(this.no_farmaco);
            result.setObject_title(this.object_title);
            result.setPosizione(this.posizione);
            result.setRegione_genoma(this.regione_genoma);
            result.setShift(this.shift);
            result.setTemp_id(this.temp_id);
            return result;
        }

    }
}
