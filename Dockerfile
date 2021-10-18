FROM openjdk:11
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN javac Main.java
CMD ["java", "Main"]
#RUN javac ./1_Java_Data_type/JavaString.java
#CMD ["java" ,"1_Java_Data_type/JavaString"]

