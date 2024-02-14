mydata=iris[,1:4]

fit= kmeans(x=mydata,centers=3)
fit
fit$cluster
library(cluster)
clusplot(mydata, fit$cluster, color = T,shade = T,labels=2,lines=0)

subset(mydata,fit$cluster==3)
