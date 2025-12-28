package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Markers_altri, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliMarkers_altriDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String AP_CD34_15;
    private String CD14_11b_51_61;
    private String CDACT;
    private String CMVIgG_OD;
    private String Cistatina_C;
    private String EndoCAb;
    private String HLADR_cd38_cd8;
    private String IL6;
    private String LPS;
    private String LPS_P;
    private String LPS_V;
    private String LPS_recovery;
    private String PCR;
    private String PCR_US;
    private String PTX3;
    private String TNFa;
    private Integer VCAM1;
    private String _id;
    private String anti3S_AU;
    private Boolean cell;
    private String data;
    private String hivdna_copie_cells;
    private String hivdna_copie_ml;
    private Boolean reliab;
    private String rs1840680;
    private String rs2305619;
    private String rs35948036;
    private String rs3845978;
    private String sCD;
    private String sCD14;
    private String sCD163;
    private String tipo_marker;
    private String valore;
    private Boolean variable;
    private String volume;
    private CliTipo_markerDTO tipo_marker_;
    private CliPazienteDTO paziente_;

    public CliMarkers_altriDTO() {
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
     * The attribute AP_CD34_15 of Markers_altri. It is of type Real @realFormat.
     */
    public String getAP_CD34_15() {
        return AP_CD34_15;
    }
    /**
     * The attribute AP_CD34_15 of Markers_altri. It is of type Real @realFormat.
     */
    public void setAP_CD34_15(String AP_CD34_15) {
        this.AP_CD34_15 = AP_CD34_15;
    }

    /**
     * The attribute CD14_11b_51_61 of Markers_altri. It is of type Real @realFormat.
     */
    public String getCD14_11b_51_61() {
        return CD14_11b_51_61;
    }
    /**
     * The attribute CD14_11b_51_61 of Markers_altri. It is of type Real @realFormat.
     */
    public void setCD14_11b_51_61(String CD14_11b_51_61) {
        this.CD14_11b_51_61 = CD14_11b_51_61;
    }

    /**
     * The attribute CDACT of Markers_altri. It is of type Real @realFormat.
     */
    public String getCDACT() {
        return CDACT;
    }
    /**
     * The attribute CDACT of Markers_altri. It is of type Real @realFormat.
     */
    public void setCDACT(String CDACT) {
        this.CDACT = CDACT;
    }

    /**
     * The attribute CMVIgG_OD of Markers_altri. It is of type Real @realFormat.
     */
    public String getCMVIgG_OD() {
        return CMVIgG_OD;
    }
    /**
     * The attribute CMVIgG_OD of Markers_altri. It is of type Real @realFormat.
     */
    public void setCMVIgG_OD(String CMVIgG_OD) {
        this.CMVIgG_OD = CMVIgG_OD;
    }

    /**
     * The attribute Cistatina_C of Markers_altri. It is of type Real @realFormat.
     */
    public String getCistatina_C() {
        return Cistatina_C;
    }
    /**
     * The attribute Cistatina_C of Markers_altri. It is of type Real @realFormat.
     */
    public void setCistatina_C(String Cistatina_C) {
        this.Cistatina_C = Cistatina_C;
    }

    /**
     * The attribute EndoCAb of Markers_altri. It is of type Real @realFormat.
     */
    public String getEndoCAb() {
        return EndoCAb;
    }
    /**
     * The attribute EndoCAb of Markers_altri. It is of type Real @realFormat.
     */
    public void setEndoCAb(String EndoCAb) {
        this.EndoCAb = EndoCAb;
    }

    /**
     * The attribute HLADR_cd38_cd8 of Markers_altri. It is of type Real @realFormat.
     */
    public String getHLADR_cd38_cd8() {
        return HLADR_cd38_cd8;
    }
    /**
     * The attribute HLADR_cd38_cd8 of Markers_altri. It is of type Real @realFormat.
     */
    public void setHLADR_cd38_cd8(String HLADR_cd38_cd8) {
        this.HLADR_cd38_cd8 = HLADR_cd38_cd8;
    }

    /**
     * The attribute IL6 of Markers_altri. It is of type Real @realFormat.
     */
    public String getIL6() {
        return IL6;
    }
    /**
     * The attribute IL6 of Markers_altri. It is of type Real @realFormat.
     */
    public void setIL6(String IL6) {
        this.IL6 = IL6;
    }

    /**
     * The attribute LPS of Markers_altri. It is of type Real @realFormat.
     */
    public String getLPS() {
        return LPS;
    }
    /**
     * The attribute LPS of Markers_altri. It is of type Real @realFormat.
     */
    public void setLPS(String LPS) {
        this.LPS = LPS;
    }

    /**
     * The attribute LPS_P of Markers_altri. It is of type Real @realFormat.
     */
    public String getLPS_P() {
        return LPS_P;
    }
    /**
     * The attribute LPS_P of Markers_altri. It is of type Real @realFormat.
     */
    public void setLPS_P(String LPS_P) {
        this.LPS_P = LPS_P;
    }

    /**
     * The attribute LPS_V of Markers_altri. It is of type Real @realFormat.
     */
    public String getLPS_V() {
        return LPS_V;
    }
    /**
     * The attribute LPS_V of Markers_altri. It is of type Real @realFormat.
     */
    public void setLPS_V(String LPS_V) {
        this.LPS_V = LPS_V;
    }

    /**
     * The attribute LPS_recovery of Markers_altri. It is of type Real @realFormat.
     */
    public String getLPS_recovery() {
        return LPS_recovery;
    }
    /**
     * The attribute LPS_recovery of Markers_altri. It is of type Real @realFormat.
     */
    public void setLPS_recovery(String LPS_recovery) {
        this.LPS_recovery = LPS_recovery;
    }

    /**
     * The attribute PCR of Markers_altri. It is of type Real @realFormat.
     */
    public String getPCR() {
        return PCR;
    }
    /**
     * The attribute PCR of Markers_altri. It is of type Real @realFormat.
     */
    public void setPCR(String PCR) {
        this.PCR = PCR;
    }

    /**
     * The attribute PCR_US of Markers_altri. It is of type Real @realFormat.
     */
    public String getPCR_US() {
        return PCR_US;
    }
    /**
     * The attribute PCR_US of Markers_altri. It is of type Real @realFormat.
     */
    public void setPCR_US(String PCR_US) {
        this.PCR_US = PCR_US;
    }

    /**
     * The attribute PTX3 of Markers_altri. It is of type Real @realFormat.
     */
    public String getPTX3() {
        return PTX3;
    }
    /**
     * The attribute PTX3 of Markers_altri. It is of type Real @realFormat.
     */
    public void setPTX3(String PTX3) {
        this.PTX3 = PTX3;
    }

    /**
     * The attribute TNFa of Markers_altri. It is of type Real @realFormat.
     */
    public String getTNFa() {
        return TNFa;
    }
    /**
     * The attribute TNFa of Markers_altri. It is of type Real @realFormat.
     */
    public void setTNFa(String TNFa) {
        this.TNFa = TNFa;
    }

    /**
     * The attribute VCAM1 of Markers_altri. It is of type Int.
     */
    public Integer getVCAM1() {
        return VCAM1;
    }
    /**
     * The attribute VCAM1 of Markers_altri. It is of type Int.
     */
    public void setVCAM1(Integer VCAM1) {
        this.VCAM1 = VCAM1;
    }

    /**
     * The attribute _id of Markers_altri. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Markers_altri. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute anti3S_AU of Markers_altri. It is of type Real @realFormat.
     */
    public String getAnti3S_AU() {
        return anti3S_AU;
    }
    /**
     * The attribute anti3S_AU of Markers_altri. It is of type Real @realFormat.
     */
    public void setAnti3S_AU(String anti3S_AU) {
        this.anti3S_AU = anti3S_AU;
    }

    /**
     * The attribute cell of Markers_altri. It is of type Boolean.
     */
    public Boolean getCell() {
        return cell;
    }
    /**
     * The attribute cell of Markers_altri. It is of type Boolean.
     */
    public void setCell(Boolean cell) {
        this.cell = cell;
    }

    /**
     * The attribute data of Markers_altri. It is of type Date @dateFormat. Cannot be null.
     */
    public String getData() {
        return data;
    }
    /**
     * The attribute data of Markers_altri. It is of type Date @dateFormat. Cannot be null.
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * The attribute hivdna_copie_cells of Markers_altri. It is of type Real @realFormat.
     */
    public String getHivdna_copie_cells() {
        return hivdna_copie_cells;
    }
    /**
     * The attribute hivdna_copie_cells of Markers_altri. It is of type Real @realFormat.
     */
    public void setHivdna_copie_cells(String hivdna_copie_cells) {
        this.hivdna_copie_cells = hivdna_copie_cells;
    }

    /**
     * The attribute hivdna_copie_ml of Markers_altri. It is of type Real @realFormat.
     */
    public String getHivdna_copie_ml() {
        return hivdna_copie_ml;
    }
    /**
     * The attribute hivdna_copie_ml of Markers_altri. It is of type Real @realFormat.
     */
    public void setHivdna_copie_ml(String hivdna_copie_ml) {
        this.hivdna_copie_ml = hivdna_copie_ml;
    }

    /**
     * The attribute reliab of Markers_altri. It is of type Boolean.
     */
    public Boolean getReliab() {
        return reliab;
    }
    /**
     * The attribute reliab of Markers_altri. It is of type Boolean.
     */
    public void setReliab(Boolean reliab) {
        this.reliab = reliab;
    }

    /**
     * The attribute rs1840680 of Markers_altri. It is of type String. Domain: A/A OR A/G OR G/G.}Max length: 255.
     */
    public String getRs1840680() {
        return rs1840680;
    }
    /**
     * The attribute rs1840680 of Markers_altri. It is of type String. Domain: A/A OR A/G OR G/G.}Max length: 255.
     */
    public void setRs1840680(String rs1840680) {
        this.rs1840680 = rs1840680;
    }

    /**
     * The attribute rs2305619 of Markers_altri. It is of type String. Domain: A/A OR A/G OR G/G.}Max length: 255.
     */
    public String getRs2305619() {
        return rs2305619;
    }
    /**
     * The attribute rs2305619 of Markers_altri. It is of type String. Domain: A/A OR A/G OR G/G.}Max length: 255.
     */
    public void setRs2305619(String rs2305619) {
        this.rs2305619 = rs2305619;
    }

    /**
     * The attribute rs35948036 of Markers_altri. It is of type String. Domain: C/C OR C/T OR T/T.}Max length: 255.
     */
    public String getRs35948036() {
        return rs35948036;
    }
    /**
     * The attribute rs35948036 of Markers_altri. It is of type String. Domain: C/C OR C/T OR T/T.}Max length: 255.
     */
    public void setRs35948036(String rs35948036) {
        this.rs35948036 = rs35948036;
    }

    /**
     * The attribute rs3845978 of Markers_altri. It is of type String. Domain: C/C OR C/T OR T/T.}Max length: 255.
     */
    public String getRs3845978() {
        return rs3845978;
    }
    /**
     * The attribute rs3845978 of Markers_altri. It is of type String. Domain: C/C OR C/T OR T/T.}Max length: 255.
     */
    public void setRs3845978(String rs3845978) {
        this.rs3845978 = rs3845978;
    }

    /**
     * The attribute sCD of Markers_altri. It is of type Real @realFormat.
     */
    public String getSCD() {
        return sCD;
    }
    /**
     * The attribute sCD of Markers_altri. It is of type Real @realFormat.
     */
    public void setSCD(String sCD) {
        this.sCD = sCD;
    }

    /**
     * The attribute sCD14 of Markers_altri. It is of type Real @realFormat.
     */
    public String getSCD14() {
        return sCD14;
    }
    /**
     * The attribute sCD14 of Markers_altri. It is of type Real @realFormat.
     */
    public void setSCD14(String sCD14) {
        this.sCD14 = sCD14;
    }

    /**
     * The attribute sCD163 of Markers_altri. It is of type Real @realFormat.
     */
    public String getSCD163() {
        return sCD163;
    }
    /**
     * The attribute sCD163 of Markers_altri. It is of type Real @realFormat.
     */
    public void setSCD163(String sCD163) {
        this.sCD163 = sCD163;
    }

    /**
     * The attribute tipo_marker of Markers_altri. It is of type String. Path: tipo_marker_ nome. Cannot be null.
     */
    public String getTipo_marker() {
        return tipo_marker;
    }
    /**
     * The attribute tipo_marker of Markers_altri. It is of type String. Path: tipo_marker_ nome. Cannot be null.
     */
    public void setTipo_marker(String tipo_marker) {
        this.tipo_marker = tipo_marker;
    }

    /**
     * The attribute valore of Markers_altri. It is of type String. Max length: 255.
     */
    public String getValore() {
        return valore;
    }
    /**
     * The attribute valore of Markers_altri. It is of type String. Max length: 255.
     */
    public void setValore(String valore) {
        this.valore = valore;
    }

    /**
     * The attribute variable of Markers_altri. It is of type Boolean.
     */
    public Boolean getVariable() {
        return variable;
    }
    /**
     * The attribute variable of Markers_altri. It is of type Boolean.
     */
    public void setVariable(Boolean variable) {
        this.variable = variable;
    }

    /**
     * The attribute volume of Markers_altri. It is of type String. Max length: 255.
     */
    public String getVolume() {
        return volume;
    }
    /**
     * The attribute volume of Markers_altri. It is of type String. Max length: 255.
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }

    /**
     * The associated object for the role tipo_marker_.
     */
    public CliTipo_markerDTO getTipo_marker_() {
        return tipo_marker_;
    }
    /**
     * The associated object for the role tipo_marker_.
     */
    public void setTipo_marker_(CliTipo_markerDTO tipo_marker_) {
        this.tipo_marker_ = tipo_marker_;
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
        if (AP_CD34_15 != null) {
            joiner.add("AP_CD34_15: " + GraphQLRequestSerializer.getEntry(AP_CD34_15));
        }
        if (CD14_11b_51_61 != null) {
            joiner.add("CD14_11b_51_61: " + GraphQLRequestSerializer.getEntry(CD14_11b_51_61));
        }
        if (CDACT != null) {
            joiner.add("CDACT: " + GraphQLRequestSerializer.getEntry(CDACT));
        }
        if (CMVIgG_OD != null) {
            joiner.add("CMVIgG_OD: " + GraphQLRequestSerializer.getEntry(CMVIgG_OD));
        }
        if (Cistatina_C != null) {
            joiner.add("Cistatina_C: " + GraphQLRequestSerializer.getEntry(Cistatina_C));
        }
        if (EndoCAb != null) {
            joiner.add("EndoCAb: " + GraphQLRequestSerializer.getEntry(EndoCAb));
        }
        if (HLADR_cd38_cd8 != null) {
            joiner.add("HLADR_cd38_cd8: " + GraphQLRequestSerializer.getEntry(HLADR_cd38_cd8));
        }
        if (IL6 != null) {
            joiner.add("IL6: " + GraphQLRequestSerializer.getEntry(IL6));
        }
        if (LPS != null) {
            joiner.add("LPS: " + GraphQLRequestSerializer.getEntry(LPS));
        }
        if (LPS_P != null) {
            joiner.add("LPS_P: " + GraphQLRequestSerializer.getEntry(LPS_P));
        }
        if (LPS_V != null) {
            joiner.add("LPS_V: " + GraphQLRequestSerializer.getEntry(LPS_V));
        }
        if (LPS_recovery != null) {
            joiner.add("LPS_recovery: " + GraphQLRequestSerializer.getEntry(LPS_recovery));
        }
        if (PCR != null) {
            joiner.add("PCR: " + GraphQLRequestSerializer.getEntry(PCR));
        }
        if (PCR_US != null) {
            joiner.add("PCR_US: " + GraphQLRequestSerializer.getEntry(PCR_US));
        }
        if (PTX3 != null) {
            joiner.add("PTX3: " + GraphQLRequestSerializer.getEntry(PTX3));
        }
        if (TNFa != null) {
            joiner.add("TNFa: " + GraphQLRequestSerializer.getEntry(TNFa));
        }
        if (VCAM1 != null) {
            joiner.add("VCAM1: " + GraphQLRequestSerializer.getEntry(VCAM1));
        }
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (anti3S_AU != null) {
            joiner.add("anti3S_AU: " + GraphQLRequestSerializer.getEntry(anti3S_AU));
        }
        if (cell != null) {
            joiner.add("cell: " + GraphQLRequestSerializer.getEntry(cell));
        }
        if (data != null) {
            joiner.add("data: " + GraphQLRequestSerializer.getEntry(data));
        }
        if (hivdna_copie_cells != null) {
            joiner.add("hivdna_copie_cells: " + GraphQLRequestSerializer.getEntry(hivdna_copie_cells));
        }
        if (hivdna_copie_ml != null) {
            joiner.add("hivdna_copie_ml: " + GraphQLRequestSerializer.getEntry(hivdna_copie_ml));
        }
        if (reliab != null) {
            joiner.add("reliab: " + GraphQLRequestSerializer.getEntry(reliab));
        }
        if (rs1840680 != null) {
            joiner.add("rs1840680: " + GraphQLRequestSerializer.getEntry(rs1840680));
        }
        if (rs2305619 != null) {
            joiner.add("rs2305619: " + GraphQLRequestSerializer.getEntry(rs2305619));
        }
        if (rs35948036 != null) {
            joiner.add("rs35948036: " + GraphQLRequestSerializer.getEntry(rs35948036));
        }
        if (rs3845978 != null) {
            joiner.add("rs3845978: " + GraphQLRequestSerializer.getEntry(rs3845978));
        }
        if (sCD != null) {
            joiner.add("sCD: " + GraphQLRequestSerializer.getEntry(sCD));
        }
        if (sCD14 != null) {
            joiner.add("sCD14: " + GraphQLRequestSerializer.getEntry(sCD14));
        }
        if (sCD163 != null) {
            joiner.add("sCD163: " + GraphQLRequestSerializer.getEntry(sCD163));
        }
        if (tipo_marker != null) {
            joiner.add("tipo_marker: " + GraphQLRequestSerializer.getEntry(tipo_marker));
        }
        if (valore != null) {
            joiner.add("valore: " + GraphQLRequestSerializer.getEntry(valore));
        }
        if (variable != null) {
            joiner.add("variable: " + GraphQLRequestSerializer.getEntry(variable));
        }
        if (volume != null) {
            joiner.add("volume: " + GraphQLRequestSerializer.getEntry(volume));
        }
        if (tipo_marker_ != null) {
            joiner.add("tipo_marker_: " + GraphQLRequestSerializer.getEntry(tipo_marker_));
        }
        if (paziente_ != null) {
            joiner.add("paziente_: " + GraphQLRequestSerializer.getEntry(paziente_));
        }
        return joiner.toString();
    }

    public static CliMarkers_altriDTO.Builder builder() {
        return new CliMarkers_altriDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String AP_CD34_15;
        private String CD14_11b_51_61;
        private String CDACT;
        private String CMVIgG_OD;
        private String Cistatina_C;
        private String EndoCAb;
        private String HLADR_cd38_cd8;
        private String IL6;
        private String LPS;
        private String LPS_P;
        private String LPS_V;
        private String LPS_recovery;
        private String PCR;
        private String PCR_US;
        private String PTX3;
        private String TNFa;
        private Integer VCAM1;
        private String _id;
        private String anti3S_AU;
        private Boolean cell;
        private String data;
        private String hivdna_copie_cells;
        private String hivdna_copie_ml;
        private Boolean reliab;
        private String rs1840680;
        private String rs2305619;
        private String rs35948036;
        private String rs3845978;
        private String sCD;
        private String sCD14;
        private String sCD163;
        private String tipo_marker;
        private String valore;
        private Boolean variable;
        private String volume;
        private CliTipo_markerDTO tipo_marker_;
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
         * The attribute AP_CD34_15 of Markers_altri. It is of type Real @realFormat.
         */
        public Builder setAP_CD34_15(String AP_CD34_15) {
            this.AP_CD34_15 = AP_CD34_15;
            return this;
        }

        /**
         * The attribute CD14_11b_51_61 of Markers_altri. It is of type Real @realFormat.
         */
        public Builder setCD14_11b_51_61(String CD14_11b_51_61) {
            this.CD14_11b_51_61 = CD14_11b_51_61;
            return this;
        }

        /**
         * The attribute CDACT of Markers_altri. It is of type Real @realFormat.
         */
        public Builder setCDACT(String CDACT) {
            this.CDACT = CDACT;
            return this;
        }

        /**
         * The attribute CMVIgG_OD of Markers_altri. It is of type Real @realFormat.
         */
        public Builder setCMVIgG_OD(String CMVIgG_OD) {
            this.CMVIgG_OD = CMVIgG_OD;
            return this;
        }

        /**
         * The attribute Cistatina_C of Markers_altri. It is of type Real @realFormat.
         */
        public Builder setCistatina_C(String Cistatina_C) {
            this.Cistatina_C = Cistatina_C;
            return this;
        }

        /**
         * The attribute EndoCAb of Markers_altri. It is of type Real @realFormat.
         */
        public Builder setEndoCAb(String EndoCAb) {
            this.EndoCAb = EndoCAb;
            return this;
        }

        /**
         * The attribute HLADR_cd38_cd8 of Markers_altri. It is of type Real @realFormat.
         */
        public Builder setHLADR_cd38_cd8(String HLADR_cd38_cd8) {
            this.HLADR_cd38_cd8 = HLADR_cd38_cd8;
            return this;
        }

        /**
         * The attribute IL6 of Markers_altri. It is of type Real @realFormat.
         */
        public Builder setIL6(String IL6) {
            this.IL6 = IL6;
            return this;
        }

        /**
         * The attribute LPS of Markers_altri. It is of type Real @realFormat.
         */
        public Builder setLPS(String LPS) {
            this.LPS = LPS;
            return this;
        }

        /**
         * The attribute LPS_P of Markers_altri. It is of type Real @realFormat.
         */
        public Builder setLPS_P(String LPS_P) {
            this.LPS_P = LPS_P;
            return this;
        }

        /**
         * The attribute LPS_V of Markers_altri. It is of type Real @realFormat.
         */
        public Builder setLPS_V(String LPS_V) {
            this.LPS_V = LPS_V;
            return this;
        }

        /**
         * The attribute LPS_recovery of Markers_altri. It is of type Real @realFormat.
         */
        public Builder setLPS_recovery(String LPS_recovery) {
            this.LPS_recovery = LPS_recovery;
            return this;
        }

        /**
         * The attribute PCR of Markers_altri. It is of type Real @realFormat.
         */
        public Builder setPCR(String PCR) {
            this.PCR = PCR;
            return this;
        }

        /**
         * The attribute PCR_US of Markers_altri. It is of type Real @realFormat.
         */
        public Builder setPCR_US(String PCR_US) {
            this.PCR_US = PCR_US;
            return this;
        }

        /**
         * The attribute PTX3 of Markers_altri. It is of type Real @realFormat.
         */
        public Builder setPTX3(String PTX3) {
            this.PTX3 = PTX3;
            return this;
        }

        /**
         * The attribute TNFa of Markers_altri. It is of type Real @realFormat.
         */
        public Builder setTNFa(String TNFa) {
            this.TNFa = TNFa;
            return this;
        }

        /**
         * The attribute VCAM1 of Markers_altri. It is of type Int.
         */
        public Builder setVCAM1(Integer VCAM1) {
            this.VCAM1 = VCAM1;
            return this;
        }

        /**
         * The attribute _id of Markers_altri. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute anti3S_AU of Markers_altri. It is of type Real @realFormat.
         */
        public Builder setAnti3S_AU(String anti3S_AU) {
            this.anti3S_AU = anti3S_AU;
            return this;
        }

        /**
         * The attribute cell of Markers_altri. It is of type Boolean.
         */
        public Builder setCell(Boolean cell) {
            this.cell = cell;
            return this;
        }

        /**
         * The attribute data of Markers_altri. It is of type Date @dateFormat. Cannot be null.
         */
        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        /**
         * The attribute hivdna_copie_cells of Markers_altri. It is of type Real @realFormat.
         */
        public Builder setHivdna_copie_cells(String hivdna_copie_cells) {
            this.hivdna_copie_cells = hivdna_copie_cells;
            return this;
        }

        /**
         * The attribute hivdna_copie_ml of Markers_altri. It is of type Real @realFormat.
         */
        public Builder setHivdna_copie_ml(String hivdna_copie_ml) {
            this.hivdna_copie_ml = hivdna_copie_ml;
            return this;
        }

        /**
         * The attribute reliab of Markers_altri. It is of type Boolean.
         */
        public Builder setReliab(Boolean reliab) {
            this.reliab = reliab;
            return this;
        }

        /**
         * The attribute rs1840680 of Markers_altri. It is of type String. Domain: A/A OR A/G OR G/G.}Max length: 255.
         */
        public Builder setRs1840680(String rs1840680) {
            this.rs1840680 = rs1840680;
            return this;
        }

        /**
         * The attribute rs2305619 of Markers_altri. It is of type String. Domain: A/A OR A/G OR G/G.}Max length: 255.
         */
        public Builder setRs2305619(String rs2305619) {
            this.rs2305619 = rs2305619;
            return this;
        }

        /**
         * The attribute rs35948036 of Markers_altri. It is of type String. Domain: C/C OR C/T OR T/T.}Max length: 255.
         */
        public Builder setRs35948036(String rs35948036) {
            this.rs35948036 = rs35948036;
            return this;
        }

        /**
         * The attribute rs3845978 of Markers_altri. It is of type String. Domain: C/C OR C/T OR T/T.}Max length: 255.
         */
        public Builder setRs3845978(String rs3845978) {
            this.rs3845978 = rs3845978;
            return this;
        }

        /**
         * The attribute sCD of Markers_altri. It is of type Real @realFormat.
         */
        public Builder setSCD(String sCD) {
            this.sCD = sCD;
            return this;
        }

        /**
         * The attribute sCD14 of Markers_altri. It is of type Real @realFormat.
         */
        public Builder setSCD14(String sCD14) {
            this.sCD14 = sCD14;
            return this;
        }

        /**
         * The attribute sCD163 of Markers_altri. It is of type Real @realFormat.
         */
        public Builder setSCD163(String sCD163) {
            this.sCD163 = sCD163;
            return this;
        }

        /**
         * The attribute tipo_marker of Markers_altri. It is of type String. Path: tipo_marker_ nome. Cannot be null.
         */
        public Builder setTipo_marker(String tipo_marker) {
            this.tipo_marker = tipo_marker;
            return this;
        }

        /**
         * The attribute valore of Markers_altri. It is of type String. Max length: 255.
         */
        public Builder setValore(String valore) {
            this.valore = valore;
            return this;
        }

        /**
         * The attribute variable of Markers_altri. It is of type Boolean.
         */
        public Builder setVariable(Boolean variable) {
            this.variable = variable;
            return this;
        }

        /**
         * The attribute volume of Markers_altri. It is of type String. Max length: 255.
         */
        public Builder setVolume(String volume) {
            this.volume = volume;
            return this;
        }

        /**
         * The associated object for the role tipo_marker_.
         */
        public Builder setTipo_marker_(CliTipo_markerDTO tipo_marker_) {
            this.tipo_marker_ = tipo_marker_;
            return this;
        }

        /**
         * The associated object for the role paziente_.
         */
        public Builder setPaziente_(CliPazienteDTO paziente_) {
            this.paziente_ = paziente_;
            return this;
        }


        public CliMarkers_altriDTO build() {
            CliMarkers_altriDTO result = new CliMarkers_altriDTO();
            result.set_clientId(this._clientId);
            result.setAP_CD34_15(this.AP_CD34_15);
            result.setCD14_11b_51_61(this.CD14_11b_51_61);
            result.setCDACT(this.CDACT);
            result.setCMVIgG_OD(this.CMVIgG_OD);
            result.setCistatina_C(this.Cistatina_C);
            result.setEndoCAb(this.EndoCAb);
            result.setHLADR_cd38_cd8(this.HLADR_cd38_cd8);
            result.setIL6(this.IL6);
            result.setLPS(this.LPS);
            result.setLPS_P(this.LPS_P);
            result.setLPS_V(this.LPS_V);
            result.setLPS_recovery(this.LPS_recovery);
            result.setPCR(this.PCR);
            result.setPCR_US(this.PCR_US);
            result.setPTX3(this.PTX3);
            result.setTNFa(this.TNFa);
            result.setVCAM1(this.VCAM1);
            result.set_id(this._id);
            result.setAnti3S_AU(this.anti3S_AU);
            result.setCell(this.cell);
            result.setData(this.data);
            result.setHivdna_copie_cells(this.hivdna_copie_cells);
            result.setHivdna_copie_ml(this.hivdna_copie_ml);
            result.setReliab(this.reliab);
            result.setRs1840680(this.rs1840680);
            result.setRs2305619(this.rs2305619);
            result.setRs35948036(this.rs35948036);
            result.setRs3845978(this.rs3845978);
            result.setSCD(this.sCD);
            result.setSCD14(this.sCD14);
            result.setSCD163(this.sCD163);
            result.setTipo_marker(this.tipo_marker);
            result.setValore(this.valore);
            result.setVariable(this.variable);
            result.setVolume(this.volume);
            result.setTipo_marker_(this.tipo_marker_);
            result.setPaziente_(this.paziente_);
            return result;
        }

    }
}
