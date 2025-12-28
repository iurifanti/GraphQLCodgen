package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Markers_altri
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Markers_altriResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Markers_altriResponseProjection() {
    }

    public Markers_altriResponseProjection(Markers_altriResponseProjection projection) {
        super(projection);
    }

    public Markers_altriResponseProjection(List<Markers_altriResponseProjection> projections) {
        super(projections);
    }

    public Markers_altriResponseProjection all$() {
        return all$(3);
    }

    public Markers_altriResponseProjection all$(int maxDepth) {
        this._clientId();
        this.AP_CD34_15();
        this.CD14_11b_51_61();
        this.CDACT();
        this.CMVIgG_OD();
        this.Cistatina_C();
        this.EndoCAb();
        this.HLADR_cd38_cd8();
        this.IL6();
        this.LPS();
        this.LPS_P();
        this.LPS_V();
        this.LPS_recovery();
        this.PCR();
        this.PCR_US();
        this.PTX3();
        this.TNFa();
        this.VCAM1();
        this._id();
        this.anti3S_AU();
        this.cell();
        this.data();
        this.hivdna_copie_cells();
        this.hivdna_copie_ml();
        this.reliab();
        this.rs1840680();
        this.rs2305619();
        this.rs35948036();
        this.rs3845978();
        this.sCD();
        this.sCD14();
        this.sCD163();
        this.tipo_marker();
        this.valore();
        this.variable();
        this.volume();
        if (projectionDepthOnFields.getOrDefault("Markers_altriResponseProjection.Tipo_markerPageResponseProjection.tipo_marker____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Markers_altriResponseProjection.Tipo_markerPageResponseProjection.tipo_marker____associables", projectionDepthOnFields.getOrDefault("Markers_altriResponseProjection.Tipo_markerPageResponseProjection.tipo_marker____associables", 0) + 1);
            this.tipo_marker____associables(new Tipo_markerPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Markers_altriResponseProjection.Tipo_markerPageResponseProjection.tipo_marker____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Markers_altriResponseProjection.Tipo_markerResponseProjection.tipo_marker_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Markers_altriResponseProjection.Tipo_markerResponseProjection.tipo_marker_", projectionDepthOnFields.getOrDefault("Markers_altriResponseProjection.Tipo_markerResponseProjection.tipo_marker_", 0) + 1);
            this.tipo_marker_(new Tipo_markerResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Markers_altriResponseProjection.Tipo_markerResponseProjection.tipo_marker_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Markers_altriResponseProjection.PazienteResponseProjection.paziente_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Markers_altriResponseProjection.PazienteResponseProjection.paziente_", projectionDepthOnFields.getOrDefault("Markers_altriResponseProjection.PazienteResponseProjection.paziente_", 0) + 1);
            this.paziente_(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Markers_altriResponseProjection.PazienteResponseProjection.paziente_", 0)));
        }
        this.typename();
        return this;
    }

    public Markers_altriResponseProjection _clientId() {
        return _clientId(null);
    }

    public Markers_altriResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection AP_CD34_15() {
        return AP_CD34_15(null);
    }

    public Markers_altriResponseProjection AP_CD34_15(String alias) {
        add$(new GraphQLResponseField("AP_CD34_15").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection CD14_11b_51_61() {
        return CD14_11b_51_61(null);
    }

    public Markers_altriResponseProjection CD14_11b_51_61(String alias) {
        add$(new GraphQLResponseField("CD14_11b_51_61").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection CDACT() {
        return CDACT(null);
    }

    public Markers_altriResponseProjection CDACT(String alias) {
        add$(new GraphQLResponseField("CDACT").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection CMVIgG_OD() {
        return CMVIgG_OD(null);
    }

    public Markers_altriResponseProjection CMVIgG_OD(String alias) {
        add$(new GraphQLResponseField("CMVIgG_OD").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection Cistatina_C() {
        return Cistatina_C(null);
    }

    public Markers_altriResponseProjection Cistatina_C(String alias) {
        add$(new GraphQLResponseField("Cistatina_C").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection EndoCAb() {
        return EndoCAb(null);
    }

    public Markers_altriResponseProjection EndoCAb(String alias) {
        add$(new GraphQLResponseField("EndoCAb").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection HLADR_cd38_cd8() {
        return HLADR_cd38_cd8(null);
    }

    public Markers_altriResponseProjection HLADR_cd38_cd8(String alias) {
        add$(new GraphQLResponseField("HLADR_cd38_cd8").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection IL6() {
        return IL6(null);
    }

    public Markers_altriResponseProjection IL6(String alias) {
        add$(new GraphQLResponseField("IL6").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection LPS() {
        return LPS(null);
    }

    public Markers_altriResponseProjection LPS(String alias) {
        add$(new GraphQLResponseField("LPS").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection LPS_P() {
        return LPS_P(null);
    }

    public Markers_altriResponseProjection LPS_P(String alias) {
        add$(new GraphQLResponseField("LPS_P").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection LPS_V() {
        return LPS_V(null);
    }

    public Markers_altriResponseProjection LPS_V(String alias) {
        add$(new GraphQLResponseField("LPS_V").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection LPS_recovery() {
        return LPS_recovery(null);
    }

    public Markers_altriResponseProjection LPS_recovery(String alias) {
        add$(new GraphQLResponseField("LPS_recovery").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection PCR() {
        return PCR(null);
    }

    public Markers_altriResponseProjection PCR(String alias) {
        add$(new GraphQLResponseField("PCR").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection PCR_US() {
        return PCR_US(null);
    }

    public Markers_altriResponseProjection PCR_US(String alias) {
        add$(new GraphQLResponseField("PCR_US").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection PTX3() {
        return PTX3(null);
    }

    public Markers_altriResponseProjection PTX3(String alias) {
        add$(new GraphQLResponseField("PTX3").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection TNFa() {
        return TNFa(null);
    }

    public Markers_altriResponseProjection TNFa(String alias) {
        add$(new GraphQLResponseField("TNFa").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection VCAM1() {
        return VCAM1(null);
    }

    public Markers_altriResponseProjection VCAM1(String alias) {
        add$(new GraphQLResponseField("VCAM1").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection _id() {
        return _id(null);
    }

    public Markers_altriResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection anti3S_AU() {
        return anti3S_AU(null);
    }

    public Markers_altriResponseProjection anti3S_AU(String alias) {
        add$(new GraphQLResponseField("anti3S_AU").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection cell() {
        return cell(null);
    }

    public Markers_altriResponseProjection cell(String alias) {
        add$(new GraphQLResponseField("cell").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection data() {
        return data(null);
    }

    public Markers_altriResponseProjection data(String alias) {
        add$(new GraphQLResponseField("data").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection hivdna_copie_cells() {
        return hivdna_copie_cells(null);
    }

    public Markers_altriResponseProjection hivdna_copie_cells(String alias) {
        add$(new GraphQLResponseField("hivdna_copie_cells").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection hivdna_copie_ml() {
        return hivdna_copie_ml(null);
    }

    public Markers_altriResponseProjection hivdna_copie_ml(String alias) {
        add$(new GraphQLResponseField("hivdna_copie_ml").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection reliab() {
        return reliab(null);
    }

    public Markers_altriResponseProjection reliab(String alias) {
        add$(new GraphQLResponseField("reliab").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection rs1840680() {
        return rs1840680(null);
    }

    public Markers_altriResponseProjection rs1840680(String alias) {
        add$(new GraphQLResponseField("rs1840680").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection rs2305619() {
        return rs2305619(null);
    }

    public Markers_altriResponseProjection rs2305619(String alias) {
        add$(new GraphQLResponseField("rs2305619").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection rs35948036() {
        return rs35948036(null);
    }

    public Markers_altriResponseProjection rs35948036(String alias) {
        add$(new GraphQLResponseField("rs35948036").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection rs3845978() {
        return rs3845978(null);
    }

    public Markers_altriResponseProjection rs3845978(String alias) {
        add$(new GraphQLResponseField("rs3845978").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection sCD() {
        return sCD(null);
    }

    public Markers_altriResponseProjection sCD(String alias) {
        add$(new GraphQLResponseField("sCD").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection sCD14() {
        return sCD14(null);
    }

    public Markers_altriResponseProjection sCD14(String alias) {
        add$(new GraphQLResponseField("sCD14").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection sCD163() {
        return sCD163(null);
    }

    public Markers_altriResponseProjection sCD163(String alias) {
        add$(new GraphQLResponseField("sCD163").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection tipo_marker() {
        return tipo_marker(null);
    }

    public Markers_altriResponseProjection tipo_marker(String alias) {
        add$(new GraphQLResponseField("tipo_marker").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection valore() {
        return valore(null);
    }

    public Markers_altriResponseProjection valore(String alias) {
        add$(new GraphQLResponseField("valore").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection variable() {
        return variable(null);
    }

    public Markers_altriResponseProjection variable(String alias) {
        add$(new GraphQLResponseField("variable").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection volume() {
        return volume(null);
    }

    public Markers_altriResponseProjection volume(String alias) {
        add$(new GraphQLResponseField("volume").alias(alias));
        return this;
    }

    public Markers_altriResponseProjection tipo_marker____associables(Tipo_markerPageResponseProjection subProjection) {
        return tipo_marker____associables((String)null, subProjection);
    }

    public Markers_altriResponseProjection tipo_marker____associables(String alias, Tipo_markerPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("tipo_marker____associables").alias(alias).projection(subProjection));
        return this;
    }

    public Markers_altriResponseProjection tipo_marker____associables(Markers_altriTipo_marker____associablesParametrizedInput input, Tipo_markerPageResponseProjection subProjection) {
        return tipo_marker____associables(null, input, subProjection);
    }

    public Markers_altriResponseProjection tipo_marker____associables(String alias, Markers_altriTipo_marker____associablesParametrizedInput input, Tipo_markerPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("tipo_marker____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Markers_altriResponseProjection tipo_marker_(Tipo_markerResponseProjection subProjection) {
        return tipo_marker_(null, subProjection);
    }

    public Markers_altriResponseProjection tipo_marker_(String alias, Tipo_markerResponseProjection subProjection) {
        add$(new GraphQLResponseField("tipo_marker_").alias(alias).projection(subProjection));
        return this;
    }

    public Markers_altriResponseProjection paziente_(PazienteResponseProjection subProjection) {
        return paziente_(null, subProjection);
    }

    public Markers_altriResponseProjection paziente_(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("paziente_").alias(alias).projection(subProjection));
        return this;
    }

    public Markers_altriResponseProjection typename() {
        return typename(null);
    }

    public Markers_altriResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Markers_altriResponseProjection deepCopy$() {
        return new Markers_altriResponseProjection(this);
    }


}
