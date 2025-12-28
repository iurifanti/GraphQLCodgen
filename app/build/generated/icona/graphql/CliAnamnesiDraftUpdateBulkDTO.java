package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a draft update objects of class Anamnesi.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliAnamnesiDraftUpdateBulkDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String altro_luogo_test_HIV;
    private Integer anni_fumo_pregresso;
    private String data_prima_prep;
    private String data_primo_riscontro_HIV;
    private String data_sieroconversione;
    private String data_ultima_prep;
    private String data_ultimo_test_negativo;
    private String familiarita_cardiovascolare;
    private Boolean fumatore;
    private Boolean infezione_acuta;
    private Boolean prep;
    private Boolean prep_quotidiana;
    private String scolarita;
    private CliLuogo_test_HIVRoleRefDTO luogo_test_HIV_;
    private CliMotivazione_naiveRoleRefDTO motivazione_naive;

    public CliAnamnesiDraftUpdateBulkDTO() {
    }


    public String getAltro_luogo_test_HIV() {
        return altro_luogo_test_HIV;
    }
    public void setAltro_luogo_test_HIV(String altro_luogo_test_HIV) {
        this.altro_luogo_test_HIV = altro_luogo_test_HIV;
    }

    public Integer getAnni_fumo_pregresso() {
        return anni_fumo_pregresso;
    }
    public void setAnni_fumo_pregresso(Integer anni_fumo_pregresso) {
        this.anni_fumo_pregresso = anni_fumo_pregresso;
    }

    public String getData_prima_prep() {
        return data_prima_prep;
    }
    public void setData_prima_prep(String data_prima_prep) {
        this.data_prima_prep = data_prima_prep;
    }

    public String getData_primo_riscontro_HIV() {
        return data_primo_riscontro_HIV;
    }
    public void setData_primo_riscontro_HIV(String data_primo_riscontro_HIV) {
        this.data_primo_riscontro_HIV = data_primo_riscontro_HIV;
    }

    public String getData_sieroconversione() {
        return data_sieroconversione;
    }
    public void setData_sieroconversione(String data_sieroconversione) {
        this.data_sieroconversione = data_sieroconversione;
    }

    public String getData_ultima_prep() {
        return data_ultima_prep;
    }
    public void setData_ultima_prep(String data_ultima_prep) {
        this.data_ultima_prep = data_ultima_prep;
    }

    public String getData_ultimo_test_negativo() {
        return data_ultimo_test_negativo;
    }
    public void setData_ultimo_test_negativo(String data_ultimo_test_negativo) {
        this.data_ultimo_test_negativo = data_ultimo_test_negativo;
    }

    public String getFamiliarita_cardiovascolare() {
        return familiarita_cardiovascolare;
    }
    public void setFamiliarita_cardiovascolare(String familiarita_cardiovascolare) {
        this.familiarita_cardiovascolare = familiarita_cardiovascolare;
    }

    public Boolean getFumatore() {
        return fumatore;
    }
    public void setFumatore(Boolean fumatore) {
        this.fumatore = fumatore;
    }

    public Boolean getInfezione_acuta() {
        return infezione_acuta;
    }
    public void setInfezione_acuta(Boolean infezione_acuta) {
        this.infezione_acuta = infezione_acuta;
    }

    public Boolean getPrep() {
        return prep;
    }
    public void setPrep(Boolean prep) {
        this.prep = prep;
    }

    public Boolean getPrep_quotidiana() {
        return prep_quotidiana;
    }
    public void setPrep_quotidiana(Boolean prep_quotidiana) {
        this.prep_quotidiana = prep_quotidiana;
    }

    public String getScolarita() {
        return scolarita;
    }
    public void setScolarita(String scolarita) {
        this.scolarita = scolarita;
    }

    public CliLuogo_test_HIVRoleRefDTO getLuogo_test_HIV_() {
        return luogo_test_HIV_;
    }
    public void setLuogo_test_HIV_(CliLuogo_test_HIVRoleRefDTO luogo_test_HIV_) {
        this.luogo_test_HIV_ = luogo_test_HIV_;
    }

    public CliMotivazione_naiveRoleRefDTO getMotivazione_naive() {
        return motivazione_naive;
    }
    public void setMotivazione_naive(CliMotivazione_naiveRoleRefDTO motivazione_naive) {
        this.motivazione_naive = motivazione_naive;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (altro_luogo_test_HIV != null) {
            joiner.add("altro_luogo_test_HIV: " + GraphQLRequestSerializer.getEntry(altro_luogo_test_HIV));
        }
        if (anni_fumo_pregresso != null) {
            joiner.add("anni_fumo_pregresso: " + GraphQLRequestSerializer.getEntry(anni_fumo_pregresso));
        }
        if (data_prima_prep != null) {
            joiner.add("data_prima_prep: " + GraphQLRequestSerializer.getEntry(data_prima_prep));
        }
        if (data_primo_riscontro_HIV != null) {
            joiner.add("data_primo_riscontro_HIV: " + GraphQLRequestSerializer.getEntry(data_primo_riscontro_HIV));
        }
        if (data_sieroconversione != null) {
            joiner.add("data_sieroconversione: " + GraphQLRequestSerializer.getEntry(data_sieroconversione));
        }
        if (data_ultima_prep != null) {
            joiner.add("data_ultima_prep: " + GraphQLRequestSerializer.getEntry(data_ultima_prep));
        }
        if (data_ultimo_test_negativo != null) {
            joiner.add("data_ultimo_test_negativo: " + GraphQLRequestSerializer.getEntry(data_ultimo_test_negativo));
        }
        if (familiarita_cardiovascolare != null) {
            joiner.add("familiarita_cardiovascolare: " + GraphQLRequestSerializer.getEntry(familiarita_cardiovascolare));
        }
        if (fumatore != null) {
            joiner.add("fumatore: " + GraphQLRequestSerializer.getEntry(fumatore));
        }
        if (infezione_acuta != null) {
            joiner.add("infezione_acuta: " + GraphQLRequestSerializer.getEntry(infezione_acuta));
        }
        if (prep != null) {
            joiner.add("prep: " + GraphQLRequestSerializer.getEntry(prep));
        }
        if (prep_quotidiana != null) {
            joiner.add("prep_quotidiana: " + GraphQLRequestSerializer.getEntry(prep_quotidiana));
        }
        if (scolarita != null) {
            joiner.add("scolarita: " + GraphQLRequestSerializer.getEntry(scolarita));
        }
        if (luogo_test_HIV_ != null) {
            joiner.add("luogo_test_HIV_: " + GraphQLRequestSerializer.getEntry(luogo_test_HIV_));
        }
        if (motivazione_naive != null) {
            joiner.add("motivazione_naive: " + GraphQLRequestSerializer.getEntry(motivazione_naive));
        }
        return joiner.toString();
    }

    public static CliAnamnesiDraftUpdateBulkDTO.Builder builder() {
        return new CliAnamnesiDraftUpdateBulkDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String altro_luogo_test_HIV;
        private Integer anni_fumo_pregresso;
        private String data_prima_prep;
        private String data_primo_riscontro_HIV;
        private String data_sieroconversione;
        private String data_ultima_prep;
        private String data_ultimo_test_negativo;
        private String familiarita_cardiovascolare;
        private Boolean fumatore;
        private Boolean infezione_acuta;
        private Boolean prep;
        private Boolean prep_quotidiana;
        private String scolarita;
        private CliLuogo_test_HIVRoleRefDTO luogo_test_HIV_;
        private CliMotivazione_naiveRoleRefDTO motivazione_naive;

        public Builder() {
        }

        public Builder setAltro_luogo_test_HIV(String altro_luogo_test_HIV) {
            this.altro_luogo_test_HIV = altro_luogo_test_HIV;
            return this;
        }

        public Builder setAnni_fumo_pregresso(Integer anni_fumo_pregresso) {
            this.anni_fumo_pregresso = anni_fumo_pregresso;
            return this;
        }

        public Builder setData_prima_prep(String data_prima_prep) {
            this.data_prima_prep = data_prima_prep;
            return this;
        }

        public Builder setData_primo_riscontro_HIV(String data_primo_riscontro_HIV) {
            this.data_primo_riscontro_HIV = data_primo_riscontro_HIV;
            return this;
        }

        public Builder setData_sieroconversione(String data_sieroconversione) {
            this.data_sieroconversione = data_sieroconversione;
            return this;
        }

        public Builder setData_ultima_prep(String data_ultima_prep) {
            this.data_ultima_prep = data_ultima_prep;
            return this;
        }

        public Builder setData_ultimo_test_negativo(String data_ultimo_test_negativo) {
            this.data_ultimo_test_negativo = data_ultimo_test_negativo;
            return this;
        }

        public Builder setFamiliarita_cardiovascolare(String familiarita_cardiovascolare) {
            this.familiarita_cardiovascolare = familiarita_cardiovascolare;
            return this;
        }

        public Builder setFumatore(Boolean fumatore) {
            this.fumatore = fumatore;
            return this;
        }

        public Builder setInfezione_acuta(Boolean infezione_acuta) {
            this.infezione_acuta = infezione_acuta;
            return this;
        }

        public Builder setPrep(Boolean prep) {
            this.prep = prep;
            return this;
        }

        public Builder setPrep_quotidiana(Boolean prep_quotidiana) {
            this.prep_quotidiana = prep_quotidiana;
            return this;
        }

        public Builder setScolarita(String scolarita) {
            this.scolarita = scolarita;
            return this;
        }

        public Builder setLuogo_test_HIV_(CliLuogo_test_HIVRoleRefDTO luogo_test_HIV_) {
            this.luogo_test_HIV_ = luogo_test_HIV_;
            return this;
        }

        public Builder setMotivazione_naive(CliMotivazione_naiveRoleRefDTO motivazione_naive) {
            this.motivazione_naive = motivazione_naive;
            return this;
        }


        public CliAnamnesiDraftUpdateBulkDTO build() {
            CliAnamnesiDraftUpdateBulkDTO result = new CliAnamnesiDraftUpdateBulkDTO();
            result.setAltro_luogo_test_HIV(this.altro_luogo_test_HIV);
            result.setAnni_fumo_pregresso(this.anni_fumo_pregresso);
            result.setData_prima_prep(this.data_prima_prep);
            result.setData_primo_riscontro_HIV(this.data_primo_riscontro_HIV);
            result.setData_sieroconversione(this.data_sieroconversione);
            result.setData_ultima_prep(this.data_ultima_prep);
            result.setData_ultimo_test_negativo(this.data_ultimo_test_negativo);
            result.setFamiliarita_cardiovascolare(this.familiarita_cardiovascolare);
            result.setFumatore(this.fumatore);
            result.setInfezione_acuta(this.infezione_acuta);
            result.setPrep(this.prep);
            result.setPrep_quotidiana(this.prep_quotidiana);
            result.setScolarita(this.scolarita);
            result.setLuogo_test_HIV_(this.luogo_test_HIV_);
            result.setMotivazione_naive(this.motivazione_naive);
            return result;
        }

    }
}
