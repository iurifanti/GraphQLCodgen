package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Ricovero, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliRicoveroDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String ICD9_1;
    private String ICD9_10;
    private String ICD9_2;
    private String ICD9_3;
    private String ICD9_4;
    private String ICD9_5;
    private String ICD9_6;
    private String ICD9_7;
    private String ICD9_8;
    private String ICD9_9;
    private String _id;
    private String codice_centro;
    private Boolean data_approssimata;
    private String data_dimissione;
    private String data_ricovero;
    private String diagnosi;
    private CliPazienteDTO paziente_;

    public CliRicoveroDTO() {
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
     * The attribute ICD9_1 of Ricovero. It is of type String. Max length: 255.
     */
    public String getICD9_1() {
        return ICD9_1;
    }
    /**
     * The attribute ICD9_1 of Ricovero. It is of type String. Max length: 255.
     */
    public void setICD9_1(String ICD9_1) {
        this.ICD9_1 = ICD9_1;
    }

    /**
     * The attribute ICD9_10 of Ricovero. It is of type String. Max length: 255.
     */
    public String getICD9_10() {
        return ICD9_10;
    }
    /**
     * The attribute ICD9_10 of Ricovero. It is of type String. Max length: 255.
     */
    public void setICD9_10(String ICD9_10) {
        this.ICD9_10 = ICD9_10;
    }

    /**
     * The attribute ICD9_2 of Ricovero. It is of type String. Max length: 255.
     */
    public String getICD9_2() {
        return ICD9_2;
    }
    /**
     * The attribute ICD9_2 of Ricovero. It is of type String. Max length: 255.
     */
    public void setICD9_2(String ICD9_2) {
        this.ICD9_2 = ICD9_2;
    }

    /**
     * The attribute ICD9_3 of Ricovero. It is of type String. Max length: 255.
     */
    public String getICD9_3() {
        return ICD9_3;
    }
    /**
     * The attribute ICD9_3 of Ricovero. It is of type String. Max length: 255.
     */
    public void setICD9_3(String ICD9_3) {
        this.ICD9_3 = ICD9_3;
    }

    /**
     * The attribute ICD9_4 of Ricovero. It is of type String. Max length: 255.
     */
    public String getICD9_4() {
        return ICD9_4;
    }
    /**
     * The attribute ICD9_4 of Ricovero. It is of type String. Max length: 255.
     */
    public void setICD9_4(String ICD9_4) {
        this.ICD9_4 = ICD9_4;
    }

    /**
     * The attribute ICD9_5 of Ricovero. It is of type String. Max length: 255.
     */
    public String getICD9_5() {
        return ICD9_5;
    }
    /**
     * The attribute ICD9_5 of Ricovero. It is of type String. Max length: 255.
     */
    public void setICD9_5(String ICD9_5) {
        this.ICD9_5 = ICD9_5;
    }

    /**
     * The attribute ICD9_6 of Ricovero. It is of type String. Max length: 255.
     */
    public String getICD9_6() {
        return ICD9_6;
    }
    /**
     * The attribute ICD9_6 of Ricovero. It is of type String. Max length: 255.
     */
    public void setICD9_6(String ICD9_6) {
        this.ICD9_6 = ICD9_6;
    }

    /**
     * The attribute ICD9_7 of Ricovero. It is of type String. Max length: 255.
     */
    public String getICD9_7() {
        return ICD9_7;
    }
    /**
     * The attribute ICD9_7 of Ricovero. It is of type String. Max length: 255.
     */
    public void setICD9_7(String ICD9_7) {
        this.ICD9_7 = ICD9_7;
    }

    /**
     * The attribute ICD9_8 of Ricovero. It is of type String. Max length: 255.
     */
    public String getICD9_8() {
        return ICD9_8;
    }
    /**
     * The attribute ICD9_8 of Ricovero. It is of type String. Max length: 255.
     */
    public void setICD9_8(String ICD9_8) {
        this.ICD9_8 = ICD9_8;
    }

    /**
     * The attribute ICD9_9 of Ricovero. It is of type String. Max length: 255.
     */
    public String getICD9_9() {
        return ICD9_9;
    }
    /**
     * The attribute ICD9_9 of Ricovero. It is of type String. Max length: 255.
     */
    public void setICD9_9(String ICD9_9) {
        this.ICD9_9 = ICD9_9;
    }

    /**
     * The attribute _id of Ricovero. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Ricovero. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute codice_centro of Ricovero. It is of type String. Path: paziente_.centro_appartenenza_attuale codice_centro.
     */
    public String getCodice_centro() {
        return codice_centro;
    }
    /**
     * The attribute codice_centro of Ricovero. It is of type String. Path: paziente_.centro_appartenenza_attuale codice_centro.
     */
    public void setCodice_centro(String codice_centro) {
        this.codice_centro = codice_centro;
    }

    /**
     * The attribute data_approssimata of Ricovero. It is of type Boolean.
     */
    public Boolean getData_approssimata() {
        return data_approssimata;
    }
    /**
     * The attribute data_approssimata of Ricovero. It is of type Boolean.
     */
    public void setData_approssimata(Boolean data_approssimata) {
        this.data_approssimata = data_approssimata;
    }

    /**
     * The attribute data_dimissione of Ricovero. It is of type Date @dateFormat.
     */
    public String getData_dimissione() {
        return data_dimissione;
    }
    /**
     * The attribute data_dimissione of Ricovero. It is of type Date @dateFormat.
     */
    public void setData_dimissione(String data_dimissione) {
        this.data_dimissione = data_dimissione;
    }

    /**
     * The attribute data_ricovero of Ricovero. It is of type Date @dateFormat.
     */
    public String getData_ricovero() {
        return data_ricovero;
    }
    /**
     * The attribute data_ricovero of Ricovero. It is of type Date @dateFormat.
     */
    public void setData_ricovero(String data_ricovero) {
        this.data_ricovero = data_ricovero;
    }

    /**
     * The attribute diagnosi of Ricovero. It is of type Text.
     */
    public String getDiagnosi() {
        return diagnosi;
    }
    /**
     * The attribute diagnosi of Ricovero. It is of type Text.
     */
    public void setDiagnosi(String diagnosi) {
        this.diagnosi = diagnosi;
    }

    /**
     * The associated object for the role paziente_.
     */
    public CliPazienteDTO getPaziente_() {
        return paziente_;
    }
    /**
     * The associated object for the role paziente_.
     */
    public void setPaziente_(CliPazienteDTO paziente_) {
        this.paziente_ = paziente_;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
        if (ICD9_1 != null) {
            joiner.add("ICD9_1: " + GraphQLRequestSerializer.getEntry(ICD9_1));
        }
        if (ICD9_10 != null) {
            joiner.add("ICD9_10: " + GraphQLRequestSerializer.getEntry(ICD9_10));
        }
        if (ICD9_2 != null) {
            joiner.add("ICD9_2: " + GraphQLRequestSerializer.getEntry(ICD9_2));
        }
        if (ICD9_3 != null) {
            joiner.add("ICD9_3: " + GraphQLRequestSerializer.getEntry(ICD9_3));
        }
        if (ICD9_4 != null) {
            joiner.add("ICD9_4: " + GraphQLRequestSerializer.getEntry(ICD9_4));
        }
        if (ICD9_5 != null) {
            joiner.add("ICD9_5: " + GraphQLRequestSerializer.getEntry(ICD9_5));
        }
        if (ICD9_6 != null) {
            joiner.add("ICD9_6: " + GraphQLRequestSerializer.getEntry(ICD9_6));
        }
        if (ICD9_7 != null) {
            joiner.add("ICD9_7: " + GraphQLRequestSerializer.getEntry(ICD9_7));
        }
        if (ICD9_8 != null) {
            joiner.add("ICD9_8: " + GraphQLRequestSerializer.getEntry(ICD9_8));
        }
        if (ICD9_9 != null) {
            joiner.add("ICD9_9: " + GraphQLRequestSerializer.getEntry(ICD9_9));
        }
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (codice_centro != null) {
            joiner.add("codice_centro: " + GraphQLRequestSerializer.getEntry(codice_centro));
        }
        if (data_approssimata != null) {
            joiner.add("data_approssimata: " + GraphQLRequestSerializer.getEntry(data_approssimata));
        }
        if (data_dimissione != null) {
            joiner.add("data_dimissione: " + GraphQLRequestSerializer.getEntry(data_dimissione));
        }
        if (data_ricovero != null) {
            joiner.add("data_ricovero: " + GraphQLRequestSerializer.getEntry(data_ricovero));
        }
        if (diagnosi != null) {
            joiner.add("diagnosi: " + GraphQLRequestSerializer.getEntry(diagnosi));
        }
        if (paziente_ != null) {
            joiner.add("paziente_: " + GraphQLRequestSerializer.getEntry(paziente_));
        }
        return joiner.toString();
    }

    public static CliRicoveroDTO.Builder builder() {
        return new CliRicoveroDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String ICD9_1;
        private String ICD9_10;
        private String ICD9_2;
        private String ICD9_3;
        private String ICD9_4;
        private String ICD9_5;
        private String ICD9_6;
        private String ICD9_7;
        private String ICD9_8;
        private String ICD9_9;
        private String _id;
        private String codice_centro;
        private Boolean data_approssimata;
        private String data_dimissione;
        private String data_ricovero;
        private String diagnosi;
        private CliPazienteDTO paziente_;

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
         * The attribute ICD9_1 of Ricovero. It is of type String. Max length: 255.
         */
        public Builder setICD9_1(String ICD9_1) {
            this.ICD9_1 = ICD9_1;
            return this;
        }

        /**
         * The attribute ICD9_10 of Ricovero. It is of type String. Max length: 255.
         */
        public Builder setICD9_10(String ICD9_10) {
            this.ICD9_10 = ICD9_10;
            return this;
        }

        /**
         * The attribute ICD9_2 of Ricovero. It is of type String. Max length: 255.
         */
        public Builder setICD9_2(String ICD9_2) {
            this.ICD9_2 = ICD9_2;
            return this;
        }

        /**
         * The attribute ICD9_3 of Ricovero. It is of type String. Max length: 255.
         */
        public Builder setICD9_3(String ICD9_3) {
            this.ICD9_3 = ICD9_3;
            return this;
        }

        /**
         * The attribute ICD9_4 of Ricovero. It is of type String. Max length: 255.
         */
        public Builder setICD9_4(String ICD9_4) {
            this.ICD9_4 = ICD9_4;
            return this;
        }

        /**
         * The attribute ICD9_5 of Ricovero. It is of type String. Max length: 255.
         */
        public Builder setICD9_5(String ICD9_5) {
            this.ICD9_5 = ICD9_5;
            return this;
        }

        /**
         * The attribute ICD9_6 of Ricovero. It is of type String. Max length: 255.
         */
        public Builder setICD9_6(String ICD9_6) {
            this.ICD9_6 = ICD9_6;
            return this;
        }

        /**
         * The attribute ICD9_7 of Ricovero. It is of type String. Max length: 255.
         */
        public Builder setICD9_7(String ICD9_7) {
            this.ICD9_7 = ICD9_7;
            return this;
        }

        /**
         * The attribute ICD9_8 of Ricovero. It is of type String. Max length: 255.
         */
        public Builder setICD9_8(String ICD9_8) {
            this.ICD9_8 = ICD9_8;
            return this;
        }

        /**
         * The attribute ICD9_9 of Ricovero. It is of type String. Max length: 255.
         */
        public Builder setICD9_9(String ICD9_9) {
            this.ICD9_9 = ICD9_9;
            return this;
        }

        /**
         * The attribute _id of Ricovero. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute codice_centro of Ricovero. It is of type String. Path: paziente_.centro_appartenenza_attuale codice_centro.
         */
        public Builder setCodice_centro(String codice_centro) {
            this.codice_centro = codice_centro;
            return this;
        }

        /**
         * The attribute data_approssimata of Ricovero. It is of type Boolean.
         */
        public Builder setData_approssimata(Boolean data_approssimata) {
            this.data_approssimata = data_approssimata;
            return this;
        }

        /**
         * The attribute data_dimissione of Ricovero. It is of type Date @dateFormat.
         */
        public Builder setData_dimissione(String data_dimissione) {
            this.data_dimissione = data_dimissione;
            return this;
        }

        /**
         * The attribute data_ricovero of Ricovero. It is of type Date @dateFormat.
         */
        public Builder setData_ricovero(String data_ricovero) {
            this.data_ricovero = data_ricovero;
            return this;
        }

        /**
         * The attribute diagnosi of Ricovero. It is of type Text.
         */
        public Builder setDiagnosi(String diagnosi) {
            this.diagnosi = diagnosi;
            return this;
        }

        /**
         * The associated object for the role paziente_.
         */
        public Builder setPaziente_(CliPazienteDTO paziente_) {
            this.paziente_ = paziente_;
            return this;
        }


        public CliRicoveroDTO build() {
            CliRicoveroDTO result = new CliRicoveroDTO();
            result.set_clientId(this._clientId);
            result.setICD9_1(this.ICD9_1);
            result.setICD9_10(this.ICD9_10);
            result.setICD9_2(this.ICD9_2);
            result.setICD9_3(this.ICD9_3);
            result.setICD9_4(this.ICD9_4);
            result.setICD9_5(this.ICD9_5);
            result.setICD9_6(this.ICD9_6);
            result.setICD9_7(this.ICD9_7);
            result.setICD9_8(this.ICD9_8);
            result.setICD9_9(this.ICD9_9);
            result.set_id(this._id);
            result.setCodice_centro(this.codice_centro);
            result.setData_approssimata(this.data_approssimata);
            result.setData_dimissione(this.data_dimissione);
            result.setData_ricovero(this.data_ricovero);
            result.setDiagnosi(this.diagnosi);
            result.setPaziente_(this.paziente_);
            return result;
        }

    }
}
