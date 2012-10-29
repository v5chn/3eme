#ifndef __NETWORK__
#define __NETWORK__

// Port d'�coute
#define PORT_LISTEN_1_2       1112
#define PORT_LISTEN_1_4       1114
#define PORT_LISTEN_2_1       1121
#define PORT_LISTEN_2_3       1123
#define PORT_LISTEN_3_2       1132
#define PORT_LISTEN_3_4       1134
#define PORT_LISTEN_4_3       1143

// Adresse IP des station
#define ADDR_STATION_1          "127.0.0.1"
#define ADDR_STATION_2          "127.0.0.1"
#define ADDR_STATION_3          "127.0.0.1"
#define ADDR_STATION_4          "127.0.0.1"

// Taille maximale des messages reseaux
#define BUFFER_SIZE           100

int initListen(int *s, sockaddr_in *addr, int port);
int SendTo (int sock, const char *host, unsigned short int port, const char *buffer, int size);

#endif