
package de.unikiel.inf.comsys.neo4j.inference.sail;

/*
 * #%L
 * neo4j-sparql-extension
 * %%
 * Copyright (C) 2014 Niclas Hoyer
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

import de.unikiel.inf.comsys.neo4j.inference.QueryRewriter;
import org.openrdf.query.algebra.TupleExpr;
import org.openrdf.query.parser.ParsedTupleQuery;
import org.openrdf.repository.sail.SailRepositoryConnection;
import org.openrdf.repository.sail.SailTupleQuery;

/**
 * A subclass of {@link SailTupleQuery} with a public constructor to
 * pass in a tuple query containing a tuple expression.
 * 
 * The original constructor of {@link SailTupleExprQuery} is protected, thus
 * it is not possible to create a new tuple query from a parsed query
 * that is used to create a query from a {@link TupleExpr}.
 * 
 * @see QueryRewriter
 */
public class SailTupleExprQuery extends SailTupleQuery {

	public SailTupleExprQuery(ParsedTupleQuery tupleQuery, SailRepositoryConnection sailConnection) {
		super(tupleQuery, sailConnection);
	}
	
}
