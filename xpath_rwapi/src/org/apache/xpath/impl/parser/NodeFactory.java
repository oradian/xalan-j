/*
 * The Apache Software License, Version 1.1
 *
 * Copyright (c) 2002-2003 The Apache Software Foundation.  All rights
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution,
 *    if any, must include the following acknowledgment:
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowledgment may appear in the software itself,
 *    if and wherever such third-party acknowledgments normally appear.
 *
 * 4. The names "Xalan" and "Apache Software Foundation" must
 *    not be used to endorse or promote products derived from this
 *    software without prior written permission. For written
 *    permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache",
 *    nor may "Apache" appear in their name, without prior written
 *    permission of the Apache Software Foundation.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation and was
 * originally based on software copyright (c) 2002, International
 * Business Machines Corporation., http://www.ibm.com.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 */
package org.apache.xpath.impl.parser;

import org.apache.xpath.impl.CastableOrCastExprImpl;
import org.apache.xpath.impl.ContextItemExprImpl;
import org.apache.xpath.impl.FunctionCallImpl;
import org.apache.xpath.impl.KindTestImpl;
import org.apache.xpath.impl.LiteralImpl;
import org.apache.xpath.impl.NameTestImpl;
import org.apache.xpath.impl.OperatorImpl;
import org.apache.xpath.impl.PathExprImpl;
import org.apache.xpath.impl.SequenceTypeImpl;
import org.apache.xpath.impl.SingleTypeImpl;
import org.apache.xpath.impl.StepExprImpl;
import org.apache.xpath.impl.TreatExprImpl;
import org.apache.xpath.impl.VariableImpl;


/**
 * Applications which want to generate their own AST need to implement this
 * interface.
 * @see org.apache.xpath.impl.parser.XPathTreeConstants
 */
public interface NodeFactory
{
	final static public String FACTORY_PROPERTY_KEY = "org.apache.xpath.impl.parser.NodeFactory";

    /**
     * Creates NameTest AST node
     * @return a new AST node or null.
     */
    NameTestImpl createNameTestNode(int id);

    /**
     * Creates KindTest AST node for the given tree node ID.
     *
     * @param id KindTest id of the node to create
     *
     * @return a new AST node or null.
     */
    KindTestImpl createKindTestNode(int id);

    /**
     * Creates Step AST node
     *
     * @return a new AST node or null.
     */
    StepExprImpl createStepNode(int id);

    /**
     * Creates Operator AST node for the given tree node ID.
     *
     * @param id Operator id of the node to create
     *
     * @return a new AST node or null.
     */
    OperatorImpl createOperatorNode(int id);

    /**
     * Creates Literal AST node for the given tree node ID.
     *
     * @param id Literal id of the node to create
     *
     * @return a new AST node or null.
     */
    LiteralImpl createLiteralNode(int id);

    /**
     * Creates Path AST node
     *
     * @return a new Path AST node or null.
     */
    PathExprImpl createPathNode(int id);

    /**
     * Creates FunctionCall AST node
     *
     * @return a new FunctionCall AST node or null.
     */
    FunctionCallImpl createFunctionCallNode(int id);

    /**
     * Creates VarName AST node
     *
     * @return a new VarName AST node or null.
     */
    VariableImpl createVarNameNode(int id);

    /**
     * Creates SequenceType AST node
     *
     * @return a new SequenceType AST node or null.
     */
    SequenceTypeImpl createSequenceTypeNode(int id);

	/**
	 * Creates a {@link SingleTypeImpl} AST Node
	 * @param id
	 * @return
	 */
	SingleTypeImpl createSingleTypeNode(int id);


    /**
     * Creates a Cast As AST node
     * @return a new Cast As AST node or null.
     */
    CastableOrCastExprImpl createCastAsNode(int id);
    
	/**
	 * Creates a new {@link CastableOrCastExprImpl} AST node.
	 * @param id
	 * @return A new 'CastableAs' AST node
	 */
	CastableOrCastExprImpl createCastableAsNode(int id);

    /**
     * Creates Treat As AST node
     * @return a new Treat As AST node or null.
     */
    TreatExprImpl createTreatAsNode(int id);
    
    /**
     * Creates <em>context item ('.')</em> AST node
     * @param id
     * @return
     */
	ContextItemExprImpl createContextItemNode(int id);

    /**
     * Creates a generic AST node for the given tree node ID.
     * @param id id of the node to create
     * @return a new AST node or null.
     */
    Node createNode(int id);


}