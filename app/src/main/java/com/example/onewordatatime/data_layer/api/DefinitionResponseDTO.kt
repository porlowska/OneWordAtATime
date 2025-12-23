package com.example.onewordatatime.data_layer.api

// DTO is a DataTransferObject class that is used to transfer data between different layers of an application.
// It typically contains only the data that needs to be transferred, only the fields that are necessary from JSON response
data class DefinitionResponseDTO(
    val word: String,
    val phonetics: String?,
    val wordDefinition: String,
    val synonyms: List<String>?
)

/*
JSON RESPONSE:
As we already have list defined in our ApiService, we only will look at the object inside the array:
            [
                {
THIS ->             "word": "anchorperson",
THIS ->             "phonetics": [],
                    "meanings": [
                        {
                            "partOfSpeech": "noun",
                            "definitions": [
                                {
THIS ->                             "definition": "The primary reporter on a television news broadcast.",
                                    "synonyms": [],
                                    "antonyms": []
                                }
                            ],
THIS ->                      "synonyms": [
                                "anchor",
                                "news anchor"
                            ],
                            "antonyms": []
                        }
                    ],
                    "license": {
                        "name": "CC BY-SA 3.0",
                        "url": "https://creativecommons.org/licenses/by-sa/3.0"
                    },
                    "sourceUrls": [
                        "https://en.wiktionary.org/wiki/anchorperson"
                    ]
                }
            ]

 */
