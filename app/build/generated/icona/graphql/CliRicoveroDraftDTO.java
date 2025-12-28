package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a draft object of class Ricovero.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliRicoveroDraftDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
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
    private Boolean data_approssimata;
    private String data_dimissione;
    private String data_ricovero;
    private String diagnosi;

    public CliRicoveroDraftDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_clientId() {
        return _clientId;
    }
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
    }

    public String getICD9_1() {
        return ICD9_1;
    }
    public void setICD9_1(String ICD9_1) {
        this.ICD9_1 = ICD9_1;
    }

    public String getICD9_10() {
        return ICD9_10;
    }
    public void setICD9_10(String ICD9_10) {
        this.ICD9_10 = ICD9_10;
    }

    public String getICD9_2() {
        return ICD9_2;
    }
    public void setICD9_2(String ICD9_2) {
        this.ICD9_2 = ICD9_2;
    }

    public String getICD9_3() {
        return ICD9_3;
    }
    public void setICD9_3(String ICD9_3) {
        this.ICD9_3 = ICD9_3;
    }

    public String getICD9_4() {
        return ICD9_4;
    }
    public void setICD9_4(String ICD9_4) {
        this.ICD9_4 = ICD9_4;
    }

    public String getICD9_5() {
        return ICD9_5;
    }
    public void setICD9_5(String ICD9_5) {
        this.ICD9_5 = ICD9_5;
    }

    public String getICD9_6() {
        return ICD9_6;
    }
    public void setICD9_6(String ICD9_6) {
        this.ICD9_6 = ICD9_6;
    }

    public String getICD9_7() {
        return ICD9_7;
    }
    public void setICD9_7(String ICD9_7) {
        this.ICD9_7 = ICD9_7;
    }

    public String getICD9_8() {
        return ICD9_8;
    }
    public void setICD9_8(String ICD9_8) {
        this.ICD9_8 = ICD9_8;
    }

    public String getICD9_9() {
        return ICD9_9;
    }
    public void setICD9_9(String ICD9_9) {
        this.ICD9_9 = ICD9_9;
    }

    public Boolean getData_approssimata() {
        return data_approssimata;
    }
    public void setData_approssimata(Boolean data_approssimata) {
        this.data_approssimata = data_approssimata;
    }

    public String getData_dimissione() {
        return data_dimissione;
    }
    public void setData_dimissione(String data_dimissione) {
        this.data_dimissione = data_dimissione;
    }

    public String getData_ricovero() {
        return data_ricovero;
    }
    public void setData_ricovero(String data_ricovero) {
        this.data_ricovero = data_ricovero;
    }

    public String getDiagnosi() {
        return diagnosi;
    }
    public void setDiagnosi(String diagnosi) {
        this.diagnosi = diagnosi;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
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
        return joiner.toString();
    }

    public static CliRicoveroDraftDTO.Builder builder() {
        return new CliRicoveroDraftDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
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
        private Boolean data_approssimata;
        private String data_dimissione;
        private String data_ricovero;
        private String diagnosi;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
            return this;
        }

        public Builder setICD9_1(String ICD9_1) {
            this.ICD9_1 = ICD9_1;
            return this;
        }

        public Builder setICD9_10(String ICD9_10) {
            this.ICD9_10 = ICD9_10;
            return this;
        }

        public Builder setICD9_2(String ICD9_2) {
            this.ICD9_2 = ICD9_2;
            return this;
        }

        public Builder setICD9_3(String ICD9_3) {
            this.ICD9_3 = ICD9_3;
            return this;
        }

        public Builder setICD9_4(String ICD9_4) {
            this.ICD9_4 = ICD9_4;
            return this;
        }

        public Builder setICD9_5(String ICD9_5) {
            this.ICD9_5 = ICD9_5;
            return this;
        }

        public Builder setICD9_6(String ICD9_6) {
            this.ICD9_6 = ICD9_6;
            return this;
        }

        public Builder setICD9_7(String ICD9_7) {
            this.ICD9_7 = ICD9_7;
            return this;
        }

        public Builder setICD9_8(String ICD9_8) {
            this.ICD9_8 = ICD9_8;
            return this;
        }

        public Builder setICD9_9(String ICD9_9) {
            this.ICD9_9 = ICD9_9;
            return this;
        }

        public Builder setData_approssimata(Boolean data_approssimata) {
            this.data_approssimata = data_approssimata;
            return this;
        }

        public Builder setData_dimissione(String data_dimissione) {
            this.data_dimissione = data_dimissione;
            return this;
        }

        public Builder setData_ricovero(String data_ricovero) {
            this.data_ricovero = data_ricovero;
            return this;
        }

        public Builder setDiagnosi(String diagnosi) {
            this.diagnosi = diagnosi;
            return this;
        }


        public CliRicoveroDraftDTO build() {
            CliRicoveroDraftDTO result = new CliRicoveroDraftDTO();
            result.set_id(this._id);
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
            result.setData_approssimata(this.data_approssimata);
            result.setData_dimissione(this.data_dimissione);
            result.setData_ricovero(this.data_ricovero);
            result.setDiagnosi(this.diagnosi);
            return result;
        }

    }
}
