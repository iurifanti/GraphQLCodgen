package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for L_dettaglio
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class L_dettaglioResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public L_dettaglioResponseProjection() {
    }

    public L_dettaglioResponseProjection(L_dettaglioResponseProjection projection) {
        super(projection);
    }

    public L_dettaglioResponseProjection(List<L_dettaglioResponseProjection> projections) {
        super(projections);
    }

    public L_dettaglioResponseProjection all$() {
        return all$(3);
    }

    public L_dettaglioResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.altezza();
        this.chimica();
        this.data();
        this.eventi_clinici();
        this.flag_altezza();
        this.flag_chimica();
        this.flag_eventi_clinici();
        this.flag_peso();
        this.flag_plasma_raccolto();
        this.flag_presentato();
        this.flag_questionari();
        this.flag_sangue_intero_raccolto();
        this.flag_viro_immun();
        this.mese();
        this.peso();
        this.plasma_raccolto();
        this.presentato();
        this.questionari();
        this.sangue_intero_raccolto();
        this.tempo_visita();
        this.viro_immun();
        if (projectionDepthOnFields.getOrDefault("L_dettaglioResponseProjection.Tempo_visitaPageResponseProjection.tempo_visita____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("L_dettaglioResponseProjection.Tempo_visitaPageResponseProjection.tempo_visita____associables", projectionDepthOnFields.getOrDefault("L_dettaglioResponseProjection.Tempo_visitaPageResponseProjection.tempo_visita____associables", 0) + 1);
            this.tempo_visita____associables(new Tempo_visitaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("L_dettaglioResponseProjection.Tempo_visitaPageResponseProjection.tempo_visita____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("L_dettaglioResponseProjection.Tempo_visitaResponseProjection.tempo_visita_", 0) <= maxDepth) {
            projectionDepthOnFields.put("L_dettaglioResponseProjection.Tempo_visitaResponseProjection.tempo_visita_", projectionDepthOnFields.getOrDefault("L_dettaglioResponseProjection.Tempo_visitaResponseProjection.tempo_visita_", 0) + 1);
            this.tempo_visita_(new Tempo_visitaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("L_dettaglioResponseProjection.Tempo_visitaResponseProjection.tempo_visita_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("L_dettaglioResponseProjection.H_PazienteResponseProjection.h_Paziente_", 0) <= maxDepth) {
            projectionDepthOnFields.put("L_dettaglioResponseProjection.H_PazienteResponseProjection.h_Paziente_", projectionDepthOnFields.getOrDefault("L_dettaglioResponseProjection.H_PazienteResponseProjection.h_Paziente_", 0) + 1);
            this.h_Paziente_(new H_PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("L_dettaglioResponseProjection.H_PazienteResponseProjection.h_Paziente_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("L_dettaglioResponseProjection.PazienteResponseProjection.paziente_", 0) <= maxDepth) {
            projectionDepthOnFields.put("L_dettaglioResponseProjection.PazienteResponseProjection.paziente_", projectionDepthOnFields.getOrDefault("L_dettaglioResponseProjection.PazienteResponseProjection.paziente_", 0) + 1);
            this.paziente_(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("L_dettaglioResponseProjection.PazienteResponseProjection.paziente_", 0)));
        }
        this.typename();
        return this;
    }

    public L_dettaglioResponseProjection _clientId() {
        return _clientId(null);
    }

    public L_dettaglioResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public L_dettaglioResponseProjection _id() {
        return _id(null);
    }

    public L_dettaglioResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public L_dettaglioResponseProjection altezza() {
        return altezza(null);
    }

    public L_dettaglioResponseProjection altezza(String alias) {
        add$(new GraphQLResponseField("altezza").alias(alias));
        return this;
    }

    public L_dettaglioResponseProjection chimica() {
        return chimica(null);
    }

    public L_dettaglioResponseProjection chimica(String alias) {
        add$(new GraphQLResponseField("chimica").alias(alias));
        return this;
    }

    public L_dettaglioResponseProjection data() {
        return data(null);
    }

    public L_dettaglioResponseProjection data(String alias) {
        add$(new GraphQLResponseField("data").alias(alias));
        return this;
    }

    public L_dettaglioResponseProjection eventi_clinici() {
        return eventi_clinici(null);
    }

    public L_dettaglioResponseProjection eventi_clinici(String alias) {
        add$(new GraphQLResponseField("eventi_clinici").alias(alias));
        return this;
    }

    public L_dettaglioResponseProjection flag_altezza() {
        return flag_altezza(null);
    }

    public L_dettaglioResponseProjection flag_altezza(String alias) {
        add$(new GraphQLResponseField("flag_altezza").alias(alias));
        return this;
    }

    public L_dettaglioResponseProjection flag_chimica() {
        return flag_chimica(null);
    }

    public L_dettaglioResponseProjection flag_chimica(String alias) {
        add$(new GraphQLResponseField("flag_chimica").alias(alias));
        return this;
    }

    public L_dettaglioResponseProjection flag_eventi_clinici() {
        return flag_eventi_clinici(null);
    }

    public L_dettaglioResponseProjection flag_eventi_clinici(String alias) {
        add$(new GraphQLResponseField("flag_eventi_clinici").alias(alias));
        return this;
    }

    public L_dettaglioResponseProjection flag_peso() {
        return flag_peso(null);
    }

    public L_dettaglioResponseProjection flag_peso(String alias) {
        add$(new GraphQLResponseField("flag_peso").alias(alias));
        return this;
    }

    public L_dettaglioResponseProjection flag_plasma_raccolto() {
        return flag_plasma_raccolto(null);
    }

    public L_dettaglioResponseProjection flag_plasma_raccolto(String alias) {
        add$(new GraphQLResponseField("flag_plasma_raccolto").alias(alias));
        return this;
    }

    public L_dettaglioResponseProjection flag_presentato() {
        return flag_presentato(null);
    }

    public L_dettaglioResponseProjection flag_presentato(String alias) {
        add$(new GraphQLResponseField("flag_presentato").alias(alias));
        return this;
    }

    public L_dettaglioResponseProjection flag_questionari() {
        return flag_questionari(null);
    }

    public L_dettaglioResponseProjection flag_questionari(String alias) {
        add$(new GraphQLResponseField("flag_questionari").alias(alias));
        return this;
    }

    public L_dettaglioResponseProjection flag_sangue_intero_raccolto() {
        return flag_sangue_intero_raccolto(null);
    }

    public L_dettaglioResponseProjection flag_sangue_intero_raccolto(String alias) {
        add$(new GraphQLResponseField("flag_sangue_intero_raccolto").alias(alias));
        return this;
    }

    public L_dettaglioResponseProjection flag_viro_immun() {
        return flag_viro_immun(null);
    }

    public L_dettaglioResponseProjection flag_viro_immun(String alias) {
        add$(new GraphQLResponseField("flag_viro_immun").alias(alias));
        return this;
    }

    public L_dettaglioResponseProjection mese() {
        return mese(null);
    }

    public L_dettaglioResponseProjection mese(String alias) {
        add$(new GraphQLResponseField("mese").alias(alias));
        return this;
    }

    public L_dettaglioResponseProjection peso() {
        return peso(null);
    }

    public L_dettaglioResponseProjection peso(String alias) {
        add$(new GraphQLResponseField("peso").alias(alias));
        return this;
    }

    public L_dettaglioResponseProjection plasma_raccolto() {
        return plasma_raccolto(null);
    }

    public L_dettaglioResponseProjection plasma_raccolto(String alias) {
        add$(new GraphQLResponseField("plasma_raccolto").alias(alias));
        return this;
    }

    public L_dettaglioResponseProjection presentato() {
        return presentato(null);
    }

    public L_dettaglioResponseProjection presentato(String alias) {
        add$(new GraphQLResponseField("presentato").alias(alias));
        return this;
    }

    public L_dettaglioResponseProjection questionari() {
        return questionari(null);
    }

    public L_dettaglioResponseProjection questionari(String alias) {
        add$(new GraphQLResponseField("questionari").alias(alias));
        return this;
    }

    public L_dettaglioResponseProjection sangue_intero_raccolto() {
        return sangue_intero_raccolto(null);
    }

    public L_dettaglioResponseProjection sangue_intero_raccolto(String alias) {
        add$(new GraphQLResponseField("sangue_intero_raccolto").alias(alias));
        return this;
    }

    public L_dettaglioResponseProjection tempo_visita() {
        return tempo_visita(null);
    }

    public L_dettaglioResponseProjection tempo_visita(String alias) {
        add$(new GraphQLResponseField("tempo_visita").alias(alias));
        return this;
    }

    public L_dettaglioResponseProjection viro_immun() {
        return viro_immun(null);
    }

    public L_dettaglioResponseProjection viro_immun(String alias) {
        add$(new GraphQLResponseField("viro_immun").alias(alias));
        return this;
    }

    public L_dettaglioResponseProjection tempo_visita____associables(Tempo_visitaPageResponseProjection subProjection) {
        return tempo_visita____associables((String)null, subProjection);
    }

    public L_dettaglioResponseProjection tempo_visita____associables(String alias, Tempo_visitaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("tempo_visita____associables").alias(alias).projection(subProjection));
        return this;
    }

    public L_dettaglioResponseProjection tempo_visita____associables(L_dettaglioTempo_visita____associablesParametrizedInput input, Tempo_visitaPageResponseProjection subProjection) {
        return tempo_visita____associables(null, input, subProjection);
    }

    public L_dettaglioResponseProjection tempo_visita____associables(String alias, L_dettaglioTempo_visita____associablesParametrizedInput input, Tempo_visitaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("tempo_visita____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public L_dettaglioResponseProjection tempo_visita_(Tempo_visitaResponseProjection subProjection) {
        return tempo_visita_(null, subProjection);
    }

    public L_dettaglioResponseProjection tempo_visita_(String alias, Tempo_visitaResponseProjection subProjection) {
        add$(new GraphQLResponseField("tempo_visita_").alias(alias).projection(subProjection));
        return this;
    }

    public L_dettaglioResponseProjection h_Paziente_(H_PazienteResponseProjection subProjection) {
        return h_Paziente_(null, subProjection);
    }

    public L_dettaglioResponseProjection h_Paziente_(String alias, H_PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("h_Paziente_").alias(alias).projection(subProjection));
        return this;
    }

    public L_dettaglioResponseProjection paziente_(PazienteResponseProjection subProjection) {
        return paziente_(null, subProjection);
    }

    public L_dettaglioResponseProjection paziente_(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("paziente_").alias(alias).projection(subProjection));
        return this;
    }

    public L_dettaglioResponseProjection typename() {
        return typename(null);
    }

    public L_dettaglioResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public L_dettaglioResponseProjection deepCopy$() {
        return new L_dettaglioResponseProjection(this);
    }


}
