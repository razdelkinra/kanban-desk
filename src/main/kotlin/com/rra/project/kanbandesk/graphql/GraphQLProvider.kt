package com.rra.project.kanbandesk.graphql

import graphql.GraphQL
import graphql.schema.GraphQLSchema
import graphql.schema.idl.RuntimeWiring
import graphql.schema.idl.SchemaGenerator
import graphql.schema.idl.SchemaParser
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import java.io.IOException
import javax.annotation.PostConstruct


class GraphQLProvider {

    private var graphQL: GraphQL? = null

    @Bean
    fun graphQL(): GraphQL? {
        return graphQL
    }

    @PostConstruct
    @Throws(IOException::class)
    fun init() {
        val url = GraphQLProvider::class.java.classLoader.getResource("schema.graphqls")
        val graphQLSchema = buildSchema(url.toString())
        this.graphQL = GraphQL.newGraphQL(graphQLSchema).build()
    }

    private fun buildSchema(sdl: String): GraphQLSchema {
        val typeRegistry = SchemaParser().parse(sdl)
        val runtimeWiring = RuntimeWiring.newRuntimeWiring()

                .build()
        val schemaGenerator = SchemaGenerator()
        return schemaGenerator.makeExecutableSchema(typeRegistry, runtimeWiring)
    }


}