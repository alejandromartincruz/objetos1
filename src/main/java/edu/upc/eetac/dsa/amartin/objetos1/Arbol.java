/*
 * Copyright 2014 Alejandro Martin Cruz
 * 
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.upc.eetac.dsa.amartin.objetos1;

public class Arbol {
	
	public String Tipo;
	public int Altura;
	
	
	public Arbol () {
		Tipo = "genérico";
		Altura = 0;
		
		System.out.println ("Un árbol genérico");
	}
	
	public Arbol (int h) {
		Tipo = "genérico";
		Altura = h;
		
		System.out.println ("Un árbol de " + Altura + " metros");
	}
	
	public Arbol (String t) {
		Tipo = t;
		Altura =0;
		
		System.out.println("Un "+ Tipo);
	}
	
	public Arbol (int h, String t) {
		Tipo = t;
		Altura = h;
		
		System.out.println("Un " + Tipo + " de " + Altura + " metros");
	}
	
}
