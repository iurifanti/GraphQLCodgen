package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Evento_epatico
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Evento_epaticoResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Evento_epaticoResponseProjection() {
    }

    public Evento_epaticoResponseProjection(Evento_epaticoResponseProjection projection) {
        super(projection);
    }

    public Evento_epaticoResponseProjection(List<Evento_epaticoResponseProjection> projections) {
        super(projections);
    }

    public Evento_epaticoResponseProjection all$() {
        return all$(3);
    }

    public Evento_epaticoResponseProjection all$(int maxDepth) {
        this._clientId();
        this._createdby();
        this._createdon();
        this._id();
        this._lastmodifiedby();
        this._lastmodifiedon();
        this._ownedby();
        this._ownedon();
        this.alcolizzazione();
        this.altra_eziologia();
        this.altra_procedura_chirurgica();
        this.altri_dettagli_istologia();
        this.chemioembolizzazione();
        this.classificazione_child();
        this.codice_centro();
        this.commenti();
        this.data();
        this.data_ricezione();
        this.data_richiesta();
        this.eziologia_alcool();
        this.eziologia_farmaci();
        this.eziologia_non_nota();
        this.id_respond();
        this.note();
        this.patologie();
        this.resezione_epatica();
        this.stato_richiesta();
        this.team();
        this.termoablazione();
        this.trapianto_epatico();
        this.warning_respond_biop();
        this.warning_respond_epa();
        if (projectionDepthOnFields.getOrDefault("Evento_epaticoResponseProjection.PatologiaPageResponseProjection.biopsia_epatica___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Evento_epaticoResponseProjection.PatologiaPageResponseProjection.biopsia_epatica___associables", projectionDepthOnFields.getOrDefault("Evento_epaticoResponseProjection.PatologiaPageResponseProjection.biopsia_epatica___associables", 0) + 1);
            this.biopsia_epatica___associables(new PatologiaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Evento_epaticoResponseProjection.PatologiaPageResponseProjection.biopsia_epatica___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Evento_epaticoResponseProjection.PatologiaPageResponseProjection.biopsia_epatica", 0) <= maxDepth) {
            projectionDepthOnFields.put("Evento_epaticoResponseProjection.PatologiaPageResponseProjection.biopsia_epatica", projectionDepthOnFields.getOrDefault("Evento_epaticoResponseProjection.PatologiaPageResponseProjection.biopsia_epatica", 0) + 1);
            this.biopsia_epatica(new PatologiaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Evento_epaticoResponseProjection.PatologiaPageResponseProjection.biopsia_epatica", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Evento_epaticoResponseProjection.PatologiaPageResponseProjection.patologia_epatica___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Evento_epaticoResponseProjection.PatologiaPageResponseProjection.patologia_epatica___associables", projectionDepthOnFields.getOrDefault("Evento_epaticoResponseProjection.PatologiaPageResponseProjection.patologia_epatica___associables", 0) + 1);
            this.patologia_epatica___associables(new PatologiaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Evento_epaticoResponseProjection.PatologiaPageResponseProjection.patologia_epatica___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Evento_epaticoResponseProjection.PatologiaPageResponseProjection.patologia_epatica", 0) <= maxDepth) {
            projectionDepthOnFields.put("Evento_epaticoResponseProjection.PatologiaPageResponseProjection.patologia_epatica", projectionDepthOnFields.getOrDefault("Evento_epaticoResponseProjection.PatologiaPageResponseProjection.patologia_epatica", 0) + 1);
            this.patologia_epatica(new PatologiaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Evento_epaticoResponseProjection.PatologiaPageResponseProjection.patologia_epatica", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Evento_epaticoResponseProjection.PatologiaPageResponseProjection.patologia_epatica_dad1___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Evento_epaticoResponseProjection.PatologiaPageResponseProjection.patologia_epatica_dad1___associables", projectionDepthOnFields.getOrDefault("Evento_epaticoResponseProjection.PatologiaPageResponseProjection.patologia_epatica_dad1___associables", 0) + 1);
            this.patologia_epatica_dad1___associables(new PatologiaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Evento_epaticoResponseProjection.PatologiaPageResponseProjection.patologia_epatica_dad1___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Evento_epaticoResponseProjection.PatologiaResponseProjection.patologia_epatica_dad1", 0) <= maxDepth) {
            projectionDepthOnFields.put("Evento_epaticoResponseProjection.PatologiaResponseProjection.patologia_epatica_dad1", projectionDepthOnFields.getOrDefault("Evento_epaticoResponseProjection.PatologiaResponseProjection.patologia_epatica_dad1", 0) + 1);
            this.patologia_epatica_dad1(new PatologiaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Evento_epaticoResponseProjection.PatologiaResponseProjection.patologia_epatica_dad1", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Evento_epaticoResponseProjection.PazienteResponseProjection.paziente_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Evento_epaticoResponseProjection.PazienteResponseProjection.paziente_", projectionDepthOnFields.getOrDefault("Evento_epaticoResponseProjection.PazienteResponseProjection.paziente_", 0) + 1);
            this.paziente_(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Evento_epaticoResponseProjection.PazienteResponseProjection.paziente_", 0)));
        }
        this.typename();
        return this;
    }

    public Evento_epaticoResponseProjection _clientId() {
        return _clientId(null);
    }

    public Evento_epaticoResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection _createdby() {
        return _createdby(null);
    }

    public Evento_epaticoResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection _createdon() {
        return _createdon(null);
    }

    public Evento_epaticoResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection _id() {
        return _id(null);
    }

    public Evento_epaticoResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public Evento_epaticoResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public Evento_epaticoResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public Evento_epaticoResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public Evento_epaticoResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection alcolizzazione() {
        return alcolizzazione(null);
    }

    public Evento_epaticoResponseProjection alcolizzazione(String alias) {
        add$(new GraphQLResponseField("alcolizzazione").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection altra_eziologia() {
        return altra_eziologia(null);
    }

    public Evento_epaticoResponseProjection altra_eziologia(String alias) {
        add$(new GraphQLResponseField("altra_eziologia").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection altra_procedura_chirurgica() {
        return altra_procedura_chirurgica(null);
    }

    public Evento_epaticoResponseProjection altra_procedura_chirurgica(String alias) {
        add$(new GraphQLResponseField("altra_procedura_chirurgica").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection altri_dettagli_istologia() {
        return altri_dettagli_istologia(null);
    }

    public Evento_epaticoResponseProjection altri_dettagli_istologia(String alias) {
        add$(new GraphQLResponseField("altri_dettagli_istologia").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection chemioembolizzazione() {
        return chemioembolizzazione(null);
    }

    public Evento_epaticoResponseProjection chemioembolizzazione(String alias) {
        add$(new GraphQLResponseField("chemioembolizzazione").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection classificazione_child() {
        return classificazione_child(null);
    }

    public Evento_epaticoResponseProjection classificazione_child(String alias) {
        add$(new GraphQLResponseField("classificazione_child").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection codice_centro() {
        return codice_centro(null);
    }

    public Evento_epaticoResponseProjection codice_centro(String alias) {
        add$(new GraphQLResponseField("codice_centro").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection commenti() {
        return commenti(null);
    }

    public Evento_epaticoResponseProjection commenti(String alias) {
        add$(new GraphQLResponseField("commenti").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection data() {
        return data(null);
    }

    public Evento_epaticoResponseProjection data(String alias) {
        add$(new GraphQLResponseField("data").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection data_ricezione() {
        return data_ricezione(null);
    }

    public Evento_epaticoResponseProjection data_ricezione(String alias) {
        add$(new GraphQLResponseField("data_ricezione").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection data_richiesta() {
        return data_richiesta(null);
    }

    public Evento_epaticoResponseProjection data_richiesta(String alias) {
        add$(new GraphQLResponseField("data_richiesta").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection eziologia_alcool() {
        return eziologia_alcool(null);
    }

    public Evento_epaticoResponseProjection eziologia_alcool(String alias) {
        add$(new GraphQLResponseField("eziologia_alcool").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection eziologia_farmaci() {
        return eziologia_farmaci(null);
    }

    public Evento_epaticoResponseProjection eziologia_farmaci(String alias) {
        add$(new GraphQLResponseField("eziologia_farmaci").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection eziologia_non_nota() {
        return eziologia_non_nota(null);
    }

    public Evento_epaticoResponseProjection eziologia_non_nota(String alias) {
        add$(new GraphQLResponseField("eziologia_non_nota").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection id_respond() {
        return id_respond(null);
    }

    public Evento_epaticoResponseProjection id_respond(String alias) {
        add$(new GraphQLResponseField("id_respond").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection note() {
        return note(null);
    }

    public Evento_epaticoResponseProjection note(String alias) {
        add$(new GraphQLResponseField("note").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection patologie() {
        return patologie(null);
    }

    public Evento_epaticoResponseProjection patologie(String alias) {
        add$(new GraphQLResponseField("patologie").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection resezione_epatica() {
        return resezione_epatica(null);
    }

    public Evento_epaticoResponseProjection resezione_epatica(String alias) {
        add$(new GraphQLResponseField("resezione_epatica").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection stato_richiesta() {
        return stato_richiesta(null);
    }

    public Evento_epaticoResponseProjection stato_richiesta(String alias) {
        add$(new GraphQLResponseField("stato_richiesta").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection team() {
        return team(null);
    }

    public Evento_epaticoResponseProjection team(String alias) {
        add$(new GraphQLResponseField("team").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection termoablazione() {
        return termoablazione(null);
    }

    public Evento_epaticoResponseProjection termoablazione(String alias) {
        add$(new GraphQLResponseField("termoablazione").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection trapianto_epatico() {
        return trapianto_epatico(null);
    }

    public Evento_epaticoResponseProjection trapianto_epatico(String alias) {
        add$(new GraphQLResponseField("trapianto_epatico").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection warning_respond_biop() {
        return warning_respond_biop(null);
    }

    public Evento_epaticoResponseProjection warning_respond_biop(String alias) {
        add$(new GraphQLResponseField("warning_respond_biop").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection warning_respond_epa() {
        return warning_respond_epa(null);
    }

    public Evento_epaticoResponseProjection warning_respond_epa(String alias) {
        add$(new GraphQLResponseField("warning_respond_epa").alias(alias));
        return this;
    }

    public Evento_epaticoResponseProjection biopsia_epatica___associables(PatologiaPageResponseProjection subProjection) {
        return biopsia_epatica___associables((String)null, subProjection);
    }

    public Evento_epaticoResponseProjection biopsia_epatica___associables(String alias, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("biopsia_epatica___associables").alias(alias).projection(subProjection));
        return this;
    }

    public Evento_epaticoResponseProjection biopsia_epatica___associables(Evento_epaticoBiopsia_epatica___associablesParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        return biopsia_epatica___associables(null, input, subProjection);
    }

    public Evento_epaticoResponseProjection biopsia_epatica___associables(String alias, Evento_epaticoBiopsia_epatica___associablesParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("biopsia_epatica___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Evento_epaticoResponseProjection biopsia_epatica(PatologiaPageResponseProjection subProjection) {
        return biopsia_epatica((String)null, subProjection);
    }

    public Evento_epaticoResponseProjection biopsia_epatica(String alias, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("biopsia_epatica").alias(alias).projection(subProjection));
        return this;
    }

    public Evento_epaticoResponseProjection biopsia_epatica(Evento_epaticoBiopsia_epaticaParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        return biopsia_epatica(null, input, subProjection);
    }

    public Evento_epaticoResponseProjection biopsia_epatica(String alias, Evento_epaticoBiopsia_epaticaParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("biopsia_epatica").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Evento_epaticoResponseProjection patologia_epatica___associables(PatologiaPageResponseProjection subProjection) {
        return patologia_epatica___associables((String)null, subProjection);
    }

    public Evento_epaticoResponseProjection patologia_epatica___associables(String alias, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("patologia_epatica___associables").alias(alias).projection(subProjection));
        return this;
    }

    public Evento_epaticoResponseProjection patologia_epatica___associables(Evento_epaticoPatologia_epatica___associablesParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        return patologia_epatica___associables(null, input, subProjection);
    }

    public Evento_epaticoResponseProjection patologia_epatica___associables(String alias, Evento_epaticoPatologia_epatica___associablesParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("patologia_epatica___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Evento_epaticoResponseProjection patologia_epatica(PatologiaPageResponseProjection subProjection) {
        return patologia_epatica((String)null, subProjection);
    }

    public Evento_epaticoResponseProjection patologia_epatica(String alias, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("patologia_epatica").alias(alias).projection(subProjection));
        return this;
    }

    public Evento_epaticoResponseProjection patologia_epatica(Evento_epaticoPatologia_epaticaParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        return patologia_epatica(null, input, subProjection);
    }

    public Evento_epaticoResponseProjection patologia_epatica(String alias, Evento_epaticoPatologia_epaticaParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("patologia_epatica").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Evento_epaticoResponseProjection patologia_epatica_dad1___associables(PatologiaPageResponseProjection subProjection) {
        return patologia_epatica_dad1___associables((String)null, subProjection);
    }

    public Evento_epaticoResponseProjection patologia_epatica_dad1___associables(String alias, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("patologia_epatica_dad1___associables").alias(alias).projection(subProjection));
        return this;
    }

    public Evento_epaticoResponseProjection patologia_epatica_dad1___associables(Evento_epaticoPatologia_epatica_dad1___associablesParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        return patologia_epatica_dad1___associables(null, input, subProjection);
    }

    public Evento_epaticoResponseProjection patologia_epatica_dad1___associables(String alias, Evento_epaticoPatologia_epatica_dad1___associablesParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("patologia_epatica_dad1___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Evento_epaticoResponseProjection patologia_epatica_dad1(PatologiaResponseProjection subProjection) {
        return patologia_epatica_dad1(null, subProjection);
    }

    public Evento_epaticoResponseProjection patologia_epatica_dad1(String alias, PatologiaResponseProjection subProjection) {
        add$(new GraphQLResponseField("patologia_epatica_dad1").alias(alias).projection(subProjection));
        return this;
    }

    public Evento_epaticoResponseProjection paziente_(PazienteResponseProjection subProjection) {
        return paziente_(null, subProjection);
    }

    public Evento_epaticoResponseProjection paziente_(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("paziente_").alias(alias).projection(subProjection));
        return this;
    }

    public Evento_epaticoResponseProjection typename() {
        return typename(null);
    }

    public Evento_epaticoResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Evento_epaticoResponseProjection deepCopy$() {
        return new Evento_epaticoResponseProjection(this);
    }


}
