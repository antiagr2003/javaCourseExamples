
dibujo.addFigura("ROJO", cuadrado1)


void addFigura(String grupo, Figura f)
{
	hm.put(grupo, f);//NOOOOOOOOOOOOO
	Collection col = hm.get(grupo);
	if(col==null) //NO EXISTE EL GRUPO
	{
		col = new ArrayList();
		col.add(f);
		hm.put(grupo, col);	
	}
	else //EL GRUPO EXISTE
	{
		col.add(figura);
	}



//Pregunta de Inés
Set grupos = hm.keySet();
for(String grupo:grupos)
{
	Collection figurasGrupo = hm.get(grupo);
	for(Figura f:figurasGrupo)
		f......
}

//Otra propuesta
Collection allFiguras = hm.values();
for(Collection figurasGrupo:allfiguras)
	for(Figura f:figurasGrupo)
		f.....



