/**
 * Return an array of arrays of size *returnSize.
 * The sizes of the arrays are returned as *returnColumnSizes array.
 * Note: Both returned array and *columnSizes array must be malloced, assume caller calls free().
 */
int** flipAndInvertImage(int** image, int imageSize, int* imageColSize, int* returnSize, int** returnColumnSizes) {
    *returnColumnSizes=(int*)malloc(sizeof(int)*imageSize);
    
    for(int i=0;i<imageSize;i++){
        (*returnColumnSizes)[i]=imageColSize[i];
        for(int j=0,k=imageColSize[i]-1;j<imageColSize[i]/2;j++,k--){
            int temp=image[i][j];
            image[i][j]=image[i][k];
            image[i][k]=temp;
        }

        for(int j=0;j<imageColSize[i];j++){
           image[i][j]=1-image[i][j];
        }
    }
    *returnSize=imageSize;
    
    return image;
}