# Usar una imagen base de MySQL
FROM mysql:8.0

# Establecer variables de entorno para la base de datos
ENV MYSQL_DATABASE=bdspringboot
ENV MYSQL_ROOT_PASSWORD=root

# Copiar el script de inicialización de la base de datos
COPY init.sql /docker-entrypoint-initdb.d/