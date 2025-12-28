package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Mutazione, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliMutazioneDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
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
    private CliSequenza_genomicaDTO Sequenza_genomica_mutazione;

    public CliMutazioneDTO() {
    }


    /**
     * A special attribute, chosen by the client, useful to
uniquely reference not existing objects.
     */
    public String get_clientId() {
        return _clientId;
    }
    /**
     * A special attribute, chosen by the client, useful to
uniquely reference not existing objects.
     */
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
    }

    /**
     * The attribute _createdby of Mutazione. It is of type String. Cannot be null.
     */
    public String get_createdby() {
        return _createdby;
    }
    /**
     * The attribute _createdby of Mutazione. It is of type String. Cannot be null.
     */
    public void set_createdby(String _createdby) {
        this._createdby = _createdby;
    }

    /**
     * The attribute _createdon of Mutazione. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_createdon() {
        return _createdon;
    }
    /**
     * The attribute _createdon of Mutazione. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_createdon(String _createdon) {
        this._createdon = _createdon;
    }

    /**
     * The attribute _id of Mutazione. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Mutazione. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute _lastmodifiedby of Mutazione. It is of type String. Cannot be null.
     */
    public String get_lastmodifiedby() {
        return _lastmodifiedby;
    }
    /**
     * The attribute _lastmodifiedby of Mutazione. It is of type String. Cannot be null.
     */
    public void set_lastmodifiedby(String _lastmodifiedby) {
        this._lastmodifiedby = _lastmodifiedby;
    }

    /**
     * The attribute _lastmodifiedon of Mutazione. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_lastmodifiedon() {
        return _lastmodifiedon;
    }
    /**
     * The attribute _lastmodifiedon of Mutazione. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_lastmodifiedon(String _lastmodifiedon) {
        this._lastmodifiedon = _lastmodifiedon;
    }

    /**
     * The attribute _ownedby of Mutazione. It is of type String. Cannot be null.
     */
    public String get_ownedby() {
        return _ownedby;
    }
    /**
     * The attribute _ownedby of Mutazione. It is of type String. Cannot be null.
     */
    public void set_ownedby(String _ownedby) {
        this._ownedby = _ownedby;
    }

    /**
     * The attribute _ownedon of Mutazione. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_ownedon() {
        return _ownedon;
    }
    /**
     * The attribute _ownedon of Mutazione. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_ownedon(String _ownedon) {
        this._ownedon = _ownedon;
    }

    /**
     * The attribute aa1 of Mutazione. It is of type String. Max length: 255.
     */
    public String getAa1() {
        return aa1;
    }
    /**
     * The attribute aa1 of Mutazione. It is of type String. Max length: 255.
     */
    public void setAa1(String aa1) {
        this.aa1 = aa1;
    }

    /**
     * The attribute aa2 of Mutazione. It is of type String. Max length: 255.
     */
    public String getAa2() {
        return aa2;
    }
    /**
     * The attribute aa2 of Mutazione. It is of type String. Max length: 255.
     */
    public void setAa2(String aa2) {
        this.aa2 = aa2;
    }

    /**
     * The attribute aa3 of Mutazione. It is of type String. Max length: 255.
     */
    public String getAa3() {
        return aa3;
    }
    /**
     * The attribute aa3 of Mutazione. It is of type String. Max length: 255.
     */
    public void setAa3(String aa3) {
        this.aa3 = aa3;
    }

    /**
     * The attribute aa4 of Mutazione. It is of type String. Max length: 255.
     */
    public String getAa4() {
        return aa4;
    }
    /**
     * The attribute aa4 of Mutazione. It is of type String. Max length: 255.
     */
    public void setAa4(String aa4) {
        this.aa4 = aa4;
    }

    /**
     * The attribute aa5 of Mutazione. It is of type String. Max length: 255.
     */
    public String getAa5() {
        return aa5;
    }
    /**
     * The attribute aa5 of Mutazione. It is of type String. Max length: 255.
     */
    public void setAa5(String aa5) {
        this.aa5 = aa5;
    }

    /**
     * The attribute deletion of Mutazione. It is of type Boolean.
     */
    public Boolean getDeletion() {
        return deletion;
    }
    /**
     * The attribute deletion of Mutazione. It is of type Boolean.
     */
    public void setDeletion(Boolean deletion) {
        this.deletion = deletion;
    }

    /**
     * The attribute insert of Mutazione. It is of type Boolean.
     */
    public Boolean getInsert() {
        return insert;
    }
    /**
     * The attribute insert of Mutazione. It is of type Boolean.
     */
    public void setInsert(Boolean insert) {
        this.insert = insert;
    }

    /**
     * The attribute no_farmaco of Mutazione. It is of type Boolean.
     */
    public Boolean getNo_farmaco() {
        return no_farmaco;
    }
    /**
     * The attribute no_farmaco of Mutazione. It is of type Boolean.
     */
    public void setNo_farmaco(Boolean no_farmaco) {
        this.no_farmaco = no_farmaco;
    }

    /**
     * The attribute object_title of Mutazione. It is of type String. Expression: 'concat("Mutazione: ", regione_genoma, "_",posizione, aa1)'.
     */
    public String getObject_title() {
        return object_title;
    }
    /**
     * The attribute object_title of Mutazione. It is of type String. Expression: 'concat("Mutazione: ", regione_genoma, "_",posizione, aa1)'.
     */
    public void setObject_title(String object_title) {
        this.object_title = object_title;
    }

    /**
     * The attribute posizione of Mutazione. It is of type Int.
     */
    public Integer getPosizione() {
        return posizione;
    }
    /**
     * The attribute posizione of Mutazione. It is of type Int.
     */
    public void setPosizione(Integer posizione) {
        this.posizione = posizione;
    }

    /**
     * The attribute regione_genoma of Mutazione. It is of type String. Domain: V3 OR RT OR PR OR ENV OR INT OR gp41.}Max length: 255.
     */
    public String getRegione_genoma() {
        return regione_genoma;
    }
    /**
     * The attribute regione_genoma of Mutazione. It is of type String. Domain: V3 OR RT OR PR OR ENV OR INT OR gp41.}Max length: 255.
     */
    public void setRegione_genoma(String regione_genoma) {
        this.regione_genoma = regione_genoma;
    }

    /**
     * The attribute shift of Mutazione. It is of type Boolean.
     */
    public Boolean getShift() {
        return shift;
    }
    /**
     * The attribute shift of Mutazione. It is of type Boolean.
     */
    public void setShift(Boolean shift) {
        this.shift = shift;
    }

    /**
     * The attribute temp_id of Mutazione. It is of type Int.
     */
    public Integer getTemp_id() {
        return temp_id;
    }
    /**
     * The attribute temp_id of Mutazione. It is of type Int.
     */
    public void setTemp_id(Integer temp_id) {
        this.temp_id = temp_id;
    }

    /**
     * The associated object for the role Sequenza_genomica_mutazione.
     */
    public CliSequenza_genomicaDTO getSequenza_genomica_mutazione() {
        return Sequenza_genomica_mutazione;
    }
    /**
     * The associated object for the role Sequenza_genomica_mutazione.
     */
    public void setSequenza_genomica_mutazione(CliSequenza_genomicaDTO Sequenza_genomica_mutazione) {
        this.Sequenza_genomica_mutazione = Sequenza_genomica_mutazione;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
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
        if (Sequenza_genomica_mutazione != null) {
            joiner.add("Sequenza_genomica_mutazione: " + GraphQLRequestSerializer.getEntry(Sequenza_genomica_mutazione));
        }
        return joiner.toString();
    }

    public static CliMutazioneDTO.Builder builder() {
        return new CliMutazioneDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private String _clientId;
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
        private CliSequenza_genomicaDTO Sequenza_genomica_mutazione;

        public Builder() {
        }

        /**
         * A special attribute, chosen by the client, useful to
uniquely reference not existing objects.
         */
        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
            return this;
        }

        /**
         * The attribute _createdby of Mutazione. It is of type String. Cannot be null.
         */
        public Builder set_createdby(String _createdby) {
            this._createdby = _createdby;
            return this;
        }

        /**
         * The attribute _createdon of Mutazione. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_createdon(String _createdon) {
            this._createdon = _createdon;
            return this;
        }

        /**
         * The attribute _id of Mutazione. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute _lastmodifiedby of Mutazione. It is of type String. Cannot be null.
         */
        public Builder set_lastmodifiedby(String _lastmodifiedby) {
            this._lastmodifiedby = _lastmodifiedby;
            return this;
        }

        /**
         * The attribute _lastmodifiedon of Mutazione. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_lastmodifiedon(String _lastmodifiedon) {
            this._lastmodifiedon = _lastmodifiedon;
            return this;
        }

        /**
         * The attribute _ownedby of Mutazione. It is of type String. Cannot be null.
         */
        public Builder set_ownedby(String _ownedby) {
            this._ownedby = _ownedby;
            return this;
        }

        /**
         * The attribute _ownedon of Mutazione. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_ownedon(String _ownedon) {
            this._ownedon = _ownedon;
            return this;
        }

        /**
         * The attribute aa1 of Mutazione. It is of type String. Max length: 255.
         */
        public Builder setAa1(String aa1) {
            this.aa1 = aa1;
            return this;
        }

        /**
         * The attribute aa2 of Mutazione. It is of type String. Max length: 255.
         */
        public Builder setAa2(String aa2) {
            this.aa2 = aa2;
            return this;
        }

        /**
         * The attribute aa3 of Mutazione. It is of type String. Max length: 255.
         */
        public Builder setAa3(String aa3) {
            this.aa3 = aa3;
            return this;
        }

        /**
         * The attribute aa4 of Mutazione. It is of type String. Max length: 255.
         */
        public Builder setAa4(String aa4) {
            this.aa4 = aa4;
            return this;
        }

        /**
         * The attribute aa5 of Mutazione. It is of type String. Max length: 255.
         */
        public Builder setAa5(String aa5) {
            this.aa5 = aa5;
            return this;
        }

        /**
         * The attribute deletion of Mutazione. It is of type Boolean.
         */
        public Builder setDeletion(Boolean deletion) {
            this.deletion = deletion;
            return this;
        }

        /**
         * The attribute insert of Mutazione. It is of type Boolean.
         */
        public Builder setInsert(Boolean insert) {
            this.insert = insert;
            return this;
        }

        /**
         * The attribute no_farmaco of Mutazione. It is of type Boolean.
         */
        public Builder setNo_farmaco(Boolean no_farmaco) {
            this.no_farmaco = no_farmaco;
            return this;
        }

        /**
         * The attribute object_title of Mutazione. It is of type String. Expression: 'concat("Mutazione: ", regione_genoma, "_",posizione, aa1)'.
         */
        public Builder setObject_title(String object_title) {
            this.object_title = object_title;
            return this;
        }

        /**
         * The attribute posizione of Mutazione. It is of type Int.
         */
        public Builder setPosizione(Integer posizione) {
            this.posizione = posizione;
            return this;
        }

        /**
         * The attribute regione_genoma of Mutazione. It is of type String. Domain: V3 OR RT OR PR OR ENV OR INT OR gp41.}Max length: 255.
         */
        public Builder setRegione_genoma(String regione_genoma) {
            this.regione_genoma = regione_genoma;
            return this;
        }

        /**
         * The attribute shift of Mutazione. It is of type Boolean.
         */
        public Builder setShift(Boolean shift) {
            this.shift = shift;
            return this;
        }

        /**
         * The attribute temp_id of Mutazione. It is of type Int.
         */
        public Builder setTemp_id(Integer temp_id) {
            this.temp_id = temp_id;
            return this;
        }

        /**
         * The associated object for the role Sequenza_genomica_mutazione.
         */
        public Builder setSequenza_genomica_mutazione(CliSequenza_genomicaDTO Sequenza_genomica_mutazione) {
            this.Sequenza_genomica_mutazione = Sequenza_genomica_mutazione;
            return this;
        }


        public CliMutazioneDTO build() {
            CliMutazioneDTO result = new CliMutazioneDTO();
            result.set_clientId(this._clientId);
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
            result.setSequenza_genomica_mutazione(this.Sequenza_genomica_mutazione);
            return result;
        }

    }
}
