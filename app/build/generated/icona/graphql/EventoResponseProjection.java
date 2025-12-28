package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Evento
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class EventoResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EventoResponseProjection() {
    }

    public EventoResponseProjection(EventoResponseProjection projection) {
        super(projection);
    }

    public EventoResponseProjection(List<EventoResponseProjection> projections) {
        super(projections);
    }

    public EventoResponseProjection all$() {
        return all$(3);
    }

    public EventoResponseProjection all$(int maxDepth) {
        this._clientId();
        this.IPI();
        this._createdby();
        this._createdon();
        this._id();
        this._lastmodifiedby();
        this._lastmodifiedon();
        this._ownedby();
        this._ownedon();
        this.aaIPI();
        this.altro();
        this.anamnesi();
        this.c_dettaglio_id();
        this.codice_centro();
        this.data();
        this.documentazione_necessaria();
        this.episodio();
        this.id_respond();
        this.metodo_diagnosi_tumore();
        this.nome_gruppo();
        this.nome_patologia();
        this.nome_tipo();
        this.object_title();
        this.paziente();
        this.paziente_o();
        this.performance_status();
        this.siti_coinvolti_M();
        this.siti_coinvolti_N();
        this.siti_coinvolti_T();
        this.specifica_tumori();
        this.stadio_tumore();
        this.stato_accertamento();
        this.tipo_imaging();
        this.warning_respond();
        if (projectionDepthOnFields.getOrDefault("EventoResponseProjection.Classificazione_ICD10PageResponseProjection.classificazione_ICD10____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("EventoResponseProjection.Classificazione_ICD10PageResponseProjection.classificazione_ICD10____associables", projectionDepthOnFields.getOrDefault("EventoResponseProjection.Classificazione_ICD10PageResponseProjection.classificazione_ICD10____associables", 0) + 1);
            this.classificazione_ICD10____associables(new Classificazione_ICD10PageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EventoResponseProjection.Classificazione_ICD10PageResponseProjection.classificazione_ICD10____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EventoResponseProjection.Classificazione_ICD10ResponseProjection.classificazione_ICD10_", 0) <= maxDepth) {
            projectionDepthOnFields.put("EventoResponseProjection.Classificazione_ICD10ResponseProjection.classificazione_ICD10_", projectionDepthOnFields.getOrDefault("EventoResponseProjection.Classificazione_ICD10ResponseProjection.classificazione_ICD10_", 0) + 1);
            this.classificazione_ICD10_(new Classificazione_ICD10ResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EventoResponseProjection.Classificazione_ICD10ResponseProjection.classificazione_ICD10_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EventoResponseProjection.PatologiaPageResponseProjection.patologia___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("EventoResponseProjection.PatologiaPageResponseProjection.patologia___associables", projectionDepthOnFields.getOrDefault("EventoResponseProjection.PatologiaPageResponseProjection.patologia___associables", 0) + 1);
            this.patologia___associables(new PatologiaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EventoResponseProjection.PatologiaPageResponseProjection.patologia___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EventoResponseProjection.PatologiaResponseProjection.patologia", 0) <= maxDepth) {
            projectionDepthOnFields.put("EventoResponseProjection.PatologiaResponseProjection.patologia", projectionDepthOnFields.getOrDefault("EventoResponseProjection.PatologiaResponseProjection.patologia", 0) + 1);
            this.patologia(new PatologiaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EventoResponseProjection.PatologiaResponseProjection.patologia", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EventoResponseProjection.PazienteResponseProjection.Paziente_evento", 0) <= maxDepth) {
            projectionDepthOnFields.put("EventoResponseProjection.PazienteResponseProjection.Paziente_evento", projectionDepthOnFields.getOrDefault("EventoResponseProjection.PazienteResponseProjection.Paziente_evento", 0) + 1);
            this.Paziente_evento(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EventoResponseProjection.PazienteResponseProjection.Paziente_evento", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EventoResponseProjection.C_dettaglioResponseProjection.c_dettaglio_", 0) <= maxDepth) {
            projectionDepthOnFields.put("EventoResponseProjection.C_dettaglioResponseProjection.c_dettaglio_", projectionDepthOnFields.getOrDefault("EventoResponseProjection.C_dettaglioResponseProjection.c_dettaglio_", 0) + 1);
            this.c_dettaglio_(new C_dettaglioResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EventoResponseProjection.C_dettaglioResponseProjection.c_dettaglio_", 0)));
        }
        this.typename();
        return this;
    }

    public EventoResponseProjection _clientId() {
        return _clientId(null);
    }

    public EventoResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public EventoResponseProjection IPI() {
        return IPI(null);
    }

    public EventoResponseProjection IPI(String alias) {
        add$(new GraphQLResponseField("IPI").alias(alias));
        return this;
    }

    public EventoResponseProjection _createdby() {
        return _createdby(null);
    }

    public EventoResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public EventoResponseProjection _createdon() {
        return _createdon(null);
    }

    public EventoResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public EventoResponseProjection _id() {
        return _id(null);
    }

    public EventoResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public EventoResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public EventoResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public EventoResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public EventoResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public EventoResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public EventoResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public EventoResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public EventoResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public EventoResponseProjection aaIPI() {
        return aaIPI(null);
    }

    public EventoResponseProjection aaIPI(String alias) {
        add$(new GraphQLResponseField("aaIPI").alias(alias));
        return this;
    }

    public EventoResponseProjection altro() {
        return altro(null);
    }

    public EventoResponseProjection altro(String alias) {
        add$(new GraphQLResponseField("altro").alias(alias));
        return this;
    }

    public EventoResponseProjection anamnesi() {
        return anamnesi(null);
    }

    public EventoResponseProjection anamnesi(String alias) {
        add$(new GraphQLResponseField("anamnesi").alias(alias));
        return this;
    }

    public EventoResponseProjection c_dettaglio_id() {
        return c_dettaglio_id(null);
    }

    public EventoResponseProjection c_dettaglio_id(String alias) {
        add$(new GraphQLResponseField("c_dettaglio_id").alias(alias));
        return this;
    }

    public EventoResponseProjection codice_centro() {
        return codice_centro(null);
    }

    public EventoResponseProjection codice_centro(String alias) {
        add$(new GraphQLResponseField("codice_centro").alias(alias));
        return this;
    }

    public EventoResponseProjection data() {
        return data(null);
    }

    public EventoResponseProjection data(String alias) {
        add$(new GraphQLResponseField("data").alias(alias));
        return this;
    }

    public EventoResponseProjection documentazione_necessaria() {
        return documentazione_necessaria(null);
    }

    public EventoResponseProjection documentazione_necessaria(String alias) {
        add$(new GraphQLResponseField("documentazione_necessaria").alias(alias));
        return this;
    }

    public EventoResponseProjection episodio() {
        return episodio(null);
    }

    public EventoResponseProjection episodio(String alias) {
        add$(new GraphQLResponseField("episodio").alias(alias));
        return this;
    }

    public EventoResponseProjection id_respond() {
        return id_respond(null);
    }

    public EventoResponseProjection id_respond(String alias) {
        add$(new GraphQLResponseField("id_respond").alias(alias));
        return this;
    }

    public EventoResponseProjection metodo_diagnosi_tumore() {
        return metodo_diagnosi_tumore(null);
    }

    public EventoResponseProjection metodo_diagnosi_tumore(String alias) {
        add$(new GraphQLResponseField("metodo_diagnosi_tumore").alias(alias));
        return this;
    }

    public EventoResponseProjection nome_gruppo() {
        return nome_gruppo(null);
    }

    public EventoResponseProjection nome_gruppo(String alias) {
        add$(new GraphQLResponseField("nome_gruppo").alias(alias));
        return this;
    }

    public EventoResponseProjection nome_patologia() {
        return nome_patologia(null);
    }

    public EventoResponseProjection nome_patologia(String alias) {
        add$(new GraphQLResponseField("nome_patologia").alias(alias));
        return this;
    }

    public EventoResponseProjection nome_tipo() {
        return nome_tipo(null);
    }

    public EventoResponseProjection nome_tipo(String alias) {
        add$(new GraphQLResponseField("nome_tipo").alias(alias));
        return this;
    }

    public EventoResponseProjection object_title() {
        return object_title(null);
    }

    public EventoResponseProjection object_title(String alias) {
        add$(new GraphQLResponseField("object_title").alias(alias));
        return this;
    }

    public EventoResponseProjection paziente() {
        return paziente(null);
    }

    public EventoResponseProjection paziente(String alias) {
        add$(new GraphQLResponseField("paziente").alias(alias));
        return this;
    }

    public EventoResponseProjection paziente_o() {
        return paziente_o(null);
    }

    public EventoResponseProjection paziente_o(String alias) {
        add$(new GraphQLResponseField("paziente_o").alias(alias));
        return this;
    }

    public EventoResponseProjection performance_status() {
        return performance_status(null);
    }

    public EventoResponseProjection performance_status(String alias) {
        add$(new GraphQLResponseField("performance_status").alias(alias));
        return this;
    }

    public EventoResponseProjection siti_coinvolti_M() {
        return siti_coinvolti_M(null);
    }

    public EventoResponseProjection siti_coinvolti_M(String alias) {
        add$(new GraphQLResponseField("siti_coinvolti_M").alias(alias));
        return this;
    }

    public EventoResponseProjection siti_coinvolti_N() {
        return siti_coinvolti_N(null);
    }

    public EventoResponseProjection siti_coinvolti_N(String alias) {
        add$(new GraphQLResponseField("siti_coinvolti_N").alias(alias));
        return this;
    }

    public EventoResponseProjection siti_coinvolti_T() {
        return siti_coinvolti_T(null);
    }

    public EventoResponseProjection siti_coinvolti_T(String alias) {
        add$(new GraphQLResponseField("siti_coinvolti_T").alias(alias));
        return this;
    }

    public EventoResponseProjection specifica_tumori() {
        return specifica_tumori(null);
    }

    public EventoResponseProjection specifica_tumori(String alias) {
        add$(new GraphQLResponseField("specifica_tumori").alias(alias));
        return this;
    }

    public EventoResponseProjection stadio_tumore() {
        return stadio_tumore(null);
    }

    public EventoResponseProjection stadio_tumore(String alias) {
        add$(new GraphQLResponseField("stadio_tumore").alias(alias));
        return this;
    }

    public EventoResponseProjection stato_accertamento() {
        return stato_accertamento(null);
    }

    public EventoResponseProjection stato_accertamento(String alias) {
        add$(new GraphQLResponseField("stato_accertamento").alias(alias));
        return this;
    }

    public EventoResponseProjection tipo_imaging() {
        return tipo_imaging(null);
    }

    public EventoResponseProjection tipo_imaging(String alias) {
        add$(new GraphQLResponseField("tipo_imaging").alias(alias));
        return this;
    }

    public EventoResponseProjection warning_respond() {
        return warning_respond(null);
    }

    public EventoResponseProjection warning_respond(String alias) {
        add$(new GraphQLResponseField("warning_respond").alias(alias));
        return this;
    }

    public EventoResponseProjection classificazione_ICD10____associables(Classificazione_ICD10PageResponseProjection subProjection) {
        return classificazione_ICD10____associables((String)null, subProjection);
    }

    public EventoResponseProjection classificazione_ICD10____associables(String alias, Classificazione_ICD10PageResponseProjection subProjection) {
        add$(new GraphQLResponseField("classificazione_ICD10____associables").alias(alias).projection(subProjection));
        return this;
    }

    public EventoResponseProjection classificazione_ICD10____associables(EventoClassificazione_ICD10____associablesParametrizedInput input, Classificazione_ICD10PageResponseProjection subProjection) {
        return classificazione_ICD10____associables(null, input, subProjection);
    }

    public EventoResponseProjection classificazione_ICD10____associables(String alias, EventoClassificazione_ICD10____associablesParametrizedInput input, Classificazione_ICD10PageResponseProjection subProjection) {
        add$(new GraphQLResponseField("classificazione_ICD10____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public EventoResponseProjection classificazione_ICD10_(Classificazione_ICD10ResponseProjection subProjection) {
        return classificazione_ICD10_(null, subProjection);
    }

    public EventoResponseProjection classificazione_ICD10_(String alias, Classificazione_ICD10ResponseProjection subProjection) {
        add$(new GraphQLResponseField("classificazione_ICD10_").alias(alias).projection(subProjection));
        return this;
    }

    public EventoResponseProjection patologia___associables(PatologiaPageResponseProjection subProjection) {
        return patologia___associables((String)null, subProjection);
    }

    public EventoResponseProjection patologia___associables(String alias, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("patologia___associables").alias(alias).projection(subProjection));
        return this;
    }

    public EventoResponseProjection patologia___associables(EventoPatologia___associablesParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        return patologia___associables(null, input, subProjection);
    }

    public EventoResponseProjection patologia___associables(String alias, EventoPatologia___associablesParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("patologia___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public EventoResponseProjection patologia(PatologiaResponseProjection subProjection) {
        return patologia(null, subProjection);
    }

    public EventoResponseProjection patologia(String alias, PatologiaResponseProjection subProjection) {
        add$(new GraphQLResponseField("patologia").alias(alias).projection(subProjection));
        return this;
    }

    public EventoResponseProjection Paziente_evento(PazienteResponseProjection subProjection) {
        return Paziente_evento(null, subProjection);
    }

    public EventoResponseProjection Paziente_evento(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("Paziente_evento").alias(alias).projection(subProjection));
        return this;
    }

    public EventoResponseProjection c_dettaglio_(C_dettaglioResponseProjection subProjection) {
        return c_dettaglio_(null, subProjection);
    }

    public EventoResponseProjection c_dettaglio_(String alias, C_dettaglioResponseProjection subProjection) {
        add$(new GraphQLResponseField("c_dettaglio_").alias(alias).projection(subProjection));
        return this;
    }

    public EventoResponseProjection typename() {
        return typename(null);
    }

    public EventoResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public EventoResponseProjection deepCopy$() {
        return new EventoResponseProjection(this);
    }


}
