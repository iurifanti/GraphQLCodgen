/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codgen.example;

import codgen.client.GraphQLClient;
import codgen.client.GraphQLErrorDTO;
import codgen.client.GraphQLRequestException;
import icona.graphql.*;
import java.util.Arrays;

public class DemoPazienteGetPage {

    public static void main(String[] args) throws Exception {

        GraphQLClient client = new GraphQLClient(
                "http://localhost:8080",
                "user",
                "pass"
        );

        CliPazientePageOptionsDTO options = CliPazientePageOptionsDTO.builder()
                .setOrderBy(Arrays.asList(CliPazienteSortDTO._id___ASC))
                .build();

        // request generata
        Paziente___getPageQueryRequest req = Paziente___getPageQueryRequest.builder()
                .setOptions(options)
                .build();

        // projection generata
        PazientePageResponseProjection proj = new PazientePageResponseProjection()
                .items(new PazienteResponseProjection()
                        ._id()
                        .codice_interno()
                        .anno_nascita()
                );

        try {
            // risposta generata (contiene data/errors)
            Paziente___getPageQueryResponse resp
                    = client.execute(req, proj, Paziente___getPageQueryResponse.class);

            CliPazientePageDTO page = resp.Paziente___getPage();

            System.out.println("totalCount=" + page.getTotalCount());
            System.out.println("hasNext=" + page.getHasNext());
            for (CliPazienteDTO p : page.getItems()) {
                System.out.println(p.get_id() + " " + p.getCodice_interno() + " " + p.getAnno_nascita());
            }

        } catch (GraphQLRequestException ex) {
            // errors[] tipizzati
            System.err.println(ex.getMessage());
            for (GraphQLErrorDTO e : ex.getErrors()) {
                System.err.println("ERR: " + e);
            }
        }
    }
}
