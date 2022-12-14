<div align="center">
<table width="1000px">
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">DEPARTAMENTO ACADÉMICO DE INGENIERÍA DE SISTEMAS E INFORMÁTICA</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>

<div align="center">
    <span style="font-weight:bold;">INFORME DE LABORATORIO</span><br />
</div>
<div align="center">
    <table width="1000px">
        <theader>
            <tr><th colspan="6">INFORMACIÓN BÁSICA</th></tr>
        </theader>
        <tbody>
            <tr><td>ASIGNATURA:</td><td colspan="5">Estructura de Datos y Algoritmos</td></tr>
            <tr><td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Árbol B</td></tr>
            <tr><td>NÚMERO DE PRÁCTICA:</td><td>06</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td width="60px">III</td></tr>
            <tr><td>FECHA DE PRESENTACION:</td><td>07-Ago-2022</td><td>HORA DE PRESENTACIÓN:</td><td colspan="3">20:00</td></tr>
            <tr>
            <td colspan="4">NOMBRE:
                <ul>
            	    <li>Melsy Melany Huamaní Vargas 100% - mhuamanivar@unsa.edu.pe</li>
                </ul>
            </td>
            <td>NOTA:</td>
            <td></td>
            </tr>
            <tr><td colspan="6" width="1000px">DOCENTE:
                <ul>
        	    <li>Richart Smith Escobedo Quispe - rescobedoq@unsa.edu.pe</li>
                </ul>
            </td>
            </tr>
        </tbody>
    </table>
</div>

<div align="center">
    <table width="1000px">
        <theader>
            <tr><th>SOLUCIÓN Y RESULTADOS</th></tr>
        </theader>
        <tbody>
	    <tr><td>I. SOLUCIÓN DE EJERCICIOS/PROBLEMAS<br/>
            Realicé los ejercicios correspondientes en el github: <a href="https://github.com/mhuamanivar/EDA22A-Individual-Lab06">https://github.com/mhuamanivar/EDA22A-Individual-Lab06</a><br/>
	    	Explicación o guía de los ejercicios.
        		<ol>
            	    <li>Ejercicio 01: Modificar el método de obtención de valor dado una clave (5 puntos)
                    	<ul>
            	            <li>En primer lugar se reutilizó parte del código enviado por el profesor como una plantilla.</li>
                            <li>Luego para requerir lo solicitado se modificó el método get() y search() para que estos retornen un ArrayList de Values y no solo de un Value.</li>
                            <li>En el método search() además se modificó que cada vez que se retornaba solo un valor, este se agregaba al ArrayList creado, para que al retornar, se entregaran todos los valores que se obtenían por la clave.</li>
                            <li>Considerar que cuando no retorna nada, entonces se muestra un ArrayList vacío, es decir que el dato solicitado no se encuentra en el árbol.</li>
                            <li>Solo se requiere ejecutar el código, debido a que no solicita ningún dato extra, solo procede con la ejecución del código que se encuentra en la carpeta del Ejercicio1</li>
                            <li>Ejemplo de ejecución</li>
                            <br/>
                            <center>
                				<img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab06/main/Ejercicio1/imagenEjec.PNG" style="width:60%; height:auto"/>
                            </center> <br/>
    	        		</ul>
                    </li> 
                    <br/>
      		    	<li>Ejercicio 02: Mostrar en un diagrama de árbol gráficamente la estructura final para los datos ingresados. (4 puntos)
                    	<ul>
            	            <li>En este caso, se puede observar la distribución de todos los datos, considerando que cuando existía un desborde de datos al querer aumentar uno nuevo a un nodo que ya poseía las 3 claves que se pueden tener como máximo (en un Árbol B de orden 4), entonces en la división de retiraba uno de los datos del medio, es decir el segundo o el tercero. En este caso, se consideró el tercero para ser el padre, y los demás valores se distribuían como nodos hijos.</li>
                            <br/>
                            <center>
                				<img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab06/main/Ejercicio2/gr%C3%A1ficoArbolB.jpg" style="width:96%; height:auto"/>
            				</center> <br/> <br/>
    	        		</ul>
                    </li>
                    <li>Ejercicio 03: El método toString() del árbol, retorna lo siguiente. ¿Por qué están entre paréntesis ciertas claves? (4 puntos)
                    	<ul>
            	            <li>A continuación se puede observar la ejecución del método toString() de la clase entregada en clase.</li>
                            <br/>
                            <center>
                				<img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab06/main/Ejercicio3/imagenToString.PNG" style="width:50%; height:auto"/>
            				</center>
                            <br/>
                            <li>Hay algunas claves que se encuentran entre paréntesis, porque el algoritmo entregado corresponde al de un árbol B+, es decir que es un árbol que se guía por los índices de los valores entregados par tener una mejor organización de los valores y de esta manera existe un óptimo algoritmo ded búsqueda.</li>
    	        		</ul>
                    </li>
                    <li>Ejercicio 04: Mostrar paso a paso el arbol-B al eliminar "www.espn.com": (4 puntos)
                    	<ul>
            	            <li>Teniendo en cuenta que el mínimo de claves de un Arbol B de orden 4 corresponde a ((4-1)/2), es decir, el número mínimo de claves por nodo es 1. Entonces, se encuentra el nodo en donde está el valor "www.espn.com". Y como se puede observar con color resaltado, el nodo ya posee el mínimo de claves (1), por lo que para eliminar el valor no se realiza de manera directa.</li>
                            <br/>
                            <center>
                				<img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab06/main/Ejercicio4/eliminacion1.jpg" style="width:96%; height:auto"/>
                            </center>
                            <br/>
                            <li>Para eliminar el nodo, se observa que su hermano adyacente tiene más que el número mínimo de claves por nodo, por lo que se realiza una redistribución y se elimina el nodo donde se encuentra el valor "www.espn.com".</li>
                            <center>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab06/main/Ejercicio4/eliminacion2.jpg" style="width:96%; height:auto"/>
                            </center>
                            <br/>
                            <li>Al realizar la redistribución, observamos que el valor mayor del hermano izquierdo sube como padre, y el antiguo padre baja a la posición del nodo eliminado. De esta manera ambos cumplen con la condición de tener como mínimo una clave por nodo.</li>
                            <center>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab06/main/Ejercicio4/eliminacion3.jpg" style="width:96%; height:auto"/>
            				</center>
                            <br/>
    	        		</ul>
                    </li>
                    <li>Ejercicio 05: Agregar un nodo adicional (www.youtube.com, 134.24.13.78) y mostrarlo paso a paso. (3 puntos)
                    	<ul>
            	            <li>Para agregar el nodo adicional de (www.youtube.com, 134.24.13.78) se puede observar que guiándonos del árbol anterior, y según el orden alfabético, se dirige hacia su hijo derecho de la raíz (puesto que "www.youtube.com" va después de "www.google.com").</li>
                            <li>Luego se evalúa con el nodo derecho, y al ser mayor que el primer valor "www.princeton.edu", se dirige al segundo valor "www.weather.com", como aún es mayor se baja hacia su hijo derecho.</li>
                            <li>De la misma manera se evalúa con el primer y segundo valor, por lo que al ser mayor que todo, entonces debería incluirse a su lado derecho.</li>
                            <br/>
                            <center>
                				<img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab06/main/Ejercicio5/insercion1.jpg" style="width:96%; height:auto"/>
                            </center>
                            <br/>
                            <li>Teniendo en cuenta que el máximo de claves de un Arbol B de orden 4 debería ser (4-1), es decir, el máximo de claves que puede haber es 3. Entonces, el nodo que aún posee solo dos claves, permite una inserción directa del valor "www.youtube.com", agregandose al lado derecho .</li>
                            <center>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab06/main/Ejercicio5/insercion2.jpg" style="width:96%; height:auto"/>
            				</center>
                            <br/>
    	        		</ul>
                    </li>
                    <br/>
    	        </ol>
            </td>
            </tr>
            <tr><td>II. SOLUCIÓN DEL CUESTIONARIO<br />
                No hubo cuestionario correspondiente a este laboratorio.
            </td>
            </tr>
	    <tr><td>III. CONCLUSIONES<br />
		En conclusión, los árboles de tipo B optimizan el uso de espacio para una mejor búsqueda al existir un ordenamiento de los valores. De la misma manera, como también se ha podido ver, en lo árboles B+, el algoritmo de búsqueda será de manera más facil debido a que será de tipo lineal al guiarnos de los índices que se encuentren. Asimismo, destacar que para llegar a un árbol de estos tipos pueden existir diversos tipos de alagoritmos que busquen optimizar el código.</td>
            </tr>
        </tbody>
    </table>
</div>

<div align="center">
    <table width="1000px">
        <theader>
            <tr><th>RETROALIMENTACIÓN GENERAL</th></tr>
        </theader>
        <tbody>
            <tr height="150px"><td width="1000px"></td></tr>
        </tbody>
    </table>
</div>

<div align="center">
    <table width="1000px">
        <theader>
            <tr><th>REFERENCIAS Y BIBLIOGRAFÍA</th></tr>
        </theader>
        <tbody>
            <tr><td width="1000px">
			<ul>
            	<li><a href="https://ccia.ugr.es/~jfv/ed1/tedi/cdrom/docs/arb_B.htm">https://ccia.ugr.es/~jfv/ed1/tedi/cdrom/docs/arb_B.htm</a></li>
                <li><a href="https://www.youtube.com/watch?v=A-MQjCmlfcI&t=359s">https://www.youtube.com/watch?v=A-MQjCmlfcI&t=359s</a></li>
                <li><a href="https://www.youtube.com/watch?v=NwA-m82-w5E&t=2027s">https://www.youtube.com/watch?v=NwA-m82-w5E&t=2027s</a></li>
    		</ul>
	    	</td></tr>
        </tbody>
    </table>
</div>
