#include "CSVParser.h"

#include "common.h"

#include <iostream>
#include <fstream>


CSVParser::CSVParser() : elements()
{
}

CSVParser::~CSVParser()
{
}

/** Charge le fichier CSV donn� */
void CSVParser::load(string filename)
{
	// Ouverture du fichier
	ifstream fichier(filename, ios::in);
	if(!fichier) return;

	string line, key, value;
	while(!fichier.eof()) {
		getline(fichier, line);

		// Cherche le d�limiteur
		int pos = line.find('=');
		if(pos < 0) continue;

		key = line.substr(0, pos);
		value = line.substr(pos + 1, line.size());

		elements[key] = value;
	}

	fichier.close();
}

/** Donne l'�lement voulu */
string CSVParser::get(string key)
{
	return elements[key];
}

/** Donne l'�lement voulu en entier */
int CSVParser::getInt(string key)
{
	int value = atoi(elements[key].c_str());

	return value;
}

/** Donne les cl�s existante */
vector<string> CSVParser::getKey()
{
	return getKeyFrom(elements);
}