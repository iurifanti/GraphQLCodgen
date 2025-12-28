package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for objects of class Terapia_covid.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliTerapia_covidUpdateBulkDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String altro_farmaco;
    private String data_fine;
    private String data_inizio;
    private CliFarmaco_covidRoleRefDTO farmaco_covid_;

    public CliTerapia_covidUpdateBulkDTO() {
    }


    public String getAltro_farmaco() {
        return altro_farmaco;
    }
    public void setAltro_farmaco(String altro_farmaco) {
        this.altro_farmaco = altro_farmaco;
    }

    public String getData_fine() {
        return data_fine;
    }
    public void setData_fine(String data_fine) {
        this.data_fine = data_fine;
    }

    public String getData_inizio() {
        return data_inizio;
    }
    public void setData_inizio(String data_inizio) {
        this.data_inizio = data_inizio;
    }

    public CliFarmaco_covidRoleRefDTO getFarmaco_covid_() {
        return farmaco_covid_;
    }
    public void setFarmaco_covid_(CliFarmaco_covidRoleRefDTO farmaco_covid_) {
        this.farmaco_covid_ = farmaco_covid_;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (altro_farmaco != null) {
            joiner.add("altro_farmaco: " + GraphQLRequestSerializer.getEntry(altro_farmaco));
        }
        if (data_fine != null) {
            joiner.add("data_fine: " + GraphQLRequestSerializer.getEntry(data_fine));
        }
        if (data_inizio != null) {
            joiner.add("data_inizio: " + GraphQLRequestSerializer.getEntry(data_inizio));
        }
        if (farmaco_covid_ != null) {
            joiner.add("farmaco_covid_: " + GraphQLRequestSerializer.getEntry(farmaco_covid_));
        }
        return joiner.toString();
    }

    public static CliTerapia_covidUpdateBulkDTO.Builder builder() {
        return new CliTerapia_covidUpdateBulkDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String altro_farmaco;
        private String data_fine;
        private String data_inizio;
        private CliFarmaco_covidRoleRefDTO farmaco_covid_;

        public Builder() {
        }

        public Builder setAltro_farmaco(String altro_farmaco) {
            this.altro_farmaco = altro_farmaco;
            return this;
        }

        public Builder setData_fine(String data_fine) {
            this.data_fine = data_fine;
            return this;
        }

        public Builder setData_inizio(String data_inizio) {
            this.data_inizio = data_inizio;
            return this;
        }

        public Builder setFarmaco_covid_(CliFarmaco_covidRoleRefDTO farmaco_covid_) {
            this.farmaco_covid_ = farmaco_covid_;
            return this;
        }


        public CliTerapia_covidUpdateBulkDTO build() {
            CliTerapia_covidUpdateBulkDTO result = new CliTerapia_covidUpdateBulkDTO();
            result.setAltro_farmaco(this.altro_farmaco);
            result.setData_fine(this.data_fine);
            result.setData_inizio(this.data_inizio);
            result.setFarmaco_covid_(this.farmaco_covid_);
            return result;
        }

    }
}
