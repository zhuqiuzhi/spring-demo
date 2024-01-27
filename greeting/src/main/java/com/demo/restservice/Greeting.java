package com.demo.restservice;

// To model the greeting representation, create a resource representation class.
// To do so, provide a Java record class for the id and content data
// The id field is a unique identifier for the greeting,
// and content is the textual representation of the greeting.
// This application uses the Jackson JSON library to automatically marshal instances of type Greeting into JSON.
// Jackson is included by default by the web starter.
public record Greeting(long id, String content) { }