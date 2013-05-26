package at.punkt.lodms.util;

import org.openrdf.model.Statement;
import org.openrdf.repository.RepositoryConnection;
import org.openrdf.repository.RepositoryException;
import org.openrdf.repository.util.RDFInserter;
import org.openrdf.rio.RDFHandlerException;

public class BatchedRdfInserter extends RDFInserter {
    public final static int DEFAULT_BATCH_SIZE = 2000;
    private int unCommittedTriples = 0;
    private int batchSize = DEFAULT_BATCH_SIZE;
    private RepositoryConnection con;

    /**
     * Creates a new RDFInserter object that preserves bnode IDs and that does
     * not enforce any context upon statements that are reported to it.
     *
     * @param con The connection to use for the add operations.
     */
    public BatchedRdfInserter(RepositoryConnection con) {
        super(con);
        this.con = con;
    }

    /**
     * Creates a new RDFInserter object that preserves bnode IDs and that does
     * not enforce any context upon statements that are reported to it.
     *
     * @param con       The connection to use for the add operations.
     * @param batchSize
     */
    public BatchedRdfInserter(RepositoryConnection con, int batchSize) {
        super(con);
        this.batchSize = batchSize;
        this.con = con;
    }

    @Override
    public void handleStatement(Statement st) throws RDFHandlerException {
        super.handleStatement(st);
        if (unCommittedTriples++ >= batchSize) {
            try {
                con.commit();
                unCommittedTriples = 0;
            } catch (RepositoryException ex) {
                throw new RDFHandlerException(ex);
            }
        }
    }
}
